module SuuchiModule
  def minValue(x, y)
    if x < y
      return x
    else
      return y
    end
  end
end

class Test
  include SuuchiModule

  def dispValue(x, y)
    min = minValue(x, y)
    print("2つの値", x, "と", y, "の中で小さい値は", min, "です\n")
  end
end

test = Test.new
test.dispValue(10, 8)
