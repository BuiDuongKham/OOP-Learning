public class Numeric {
    private int first;
    private int second;

    public Numeric(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int add(){
        return this.first + this.second;
    }

    public int subtract(){
        return this.first - this.second;
    }

    public int multiply(){
        return this.first * this.second;
    }

    public int divide() throws Exception {
        try
        {
            return this.first / this.second;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            System.out.println("End process");
        }
    }
}
