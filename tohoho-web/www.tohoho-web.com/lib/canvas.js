class Canvas {
  constructor(id) {
    var cv = document.getElementById(id); if (!cv) { return; }
    this.ct = cv.getContext('2d'); if (!this.ct) { return; }
    this.ct.font = '8pt Consolas';
    this.ct.lineWidth = 1;
  }
  getTextSize(text) {
    var tx = this.ct.measureText(text);
    var tw = tx.width;
    var th = tx.actualBoundingBoxAscent + tx.actualBoundingBoxDescent;
    return [tw, th];
  }
  box(x, y, w, h, p=null) {
    var ld = this.ct.getLineDash();
    var lw = this.ct.lineWidth = .5;
    var color = "#000";
    var bgcolor = "#fff";
    if (p && p.color) {
      color = p.color;
    }
    if (p && p.bgcolor) {
      bgcolor = p.bgcolor;
    }
    if (p && p.type) {
      if (p.type == "dash") {
          this.ct.setLineDash([2, 2]);
          this.ct.lineWidth = .5;
      }
    }
    this.ct.beginPath();
    this.ct.strokeStyle = color;
    this.ct.fillStyle = bgcolor;
    this.ct.rect(x, y, w, h);
    this.ct.fill();
    this.ct.stroke();
    if (p && p.text) {
      var [tw, th] = this.getTextSize(p.text);
      var x1 = x + w/2 - tw/2;
      var y1 = y + h/2 + th/2;
      if (p.top != null) { y1 = y + p.top + th }
      if (p.left != null) { x1 = x + p.left }
      this.text(p.text, x1, y1);
    }
    this.ct.setLineDash(ld);
    this.ct.lineWidth = lw;
    return this;
  }
  line(x, y, dx, dy, p=null) {
    var ld = this.ct.getLineDash();
    var lw = this.ct.lineWidth = .5;
    if (p && p.type) {
      if (p.type == "dash") {
          this.ct.setLineDash([2, 2]);
          this.ct.lineWidth = .5;
      }
    }
    this.ct.beginPath();
    this.ct.moveTo(x, y);
    this.ct.lineTo(x + dx, y + dy);
    this.ct.stroke();
    this.ct.setLineDash(ld);
    this.ct.lineWidth = lw;
    return this;
  }
  arrow(x, y, dx, dy, p=null) {
    var ar = 8;
    var aang = 25;
    var arad = aang / 180 * Math.PI;
    var mrad = Math.atan2(dy, dx);
    var ax1 = ar * Math.cos(Math.PI + mrad + arad);
    var ay1 = ar * Math.sin(Math.PI + mrad + arad);
    var ax2 = ar * Math.cos(Math.PI + mrad - arad);
    var ay2 = ar * Math.sin(Math.PI + mrad - arad);
    this.line(x, y, dx, dy)
        .line(x + dx, y + dy, ax1, -ay1)
        .line(x + dx, y + dy, ax2, -ay2);
    if (p && p.text) {
      var [tw, th] = this.getTextSize(p.text);
      this.text(p.text, x + dx/2 - tw/2, y - dy/2 - 5);
    }
    return this;
  }
  text(t, x, y, p=null) {
    var font = this.ct.font;
    if (p && p.font) {
      this.ct.font = p.font;
    }
    this.ct.fillStyle = "#000";
    this.ct.fillText(t, x, y);
    this.ct.font = font;
    return this;
  }
  circle(x, y, r, p=null) {
    var color = "#000";
    var bgColor = "#fff";
    if (p && p.color) {
      color = p.color;
    }
    if (p && p.bgColor) {
      bgColor = p.bgColor;
    }
    this.ct.strokeStyle = color;
    this.ct.fillStyle = bgColor;
    this.ct.beginPath();
    this.ct.arc(x, y, r, 0, (Math.PI * 2));
    this.ct.fill();
    this.ct.stroke();
  }
}
