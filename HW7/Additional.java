public class Additional implements Viewer{
    @Override
    public ComplexNum calc(ComplexNum num1, ComplexNum num2) {
        double realNum= num1.getRealNum()+num2.getRealNum();
        double imaginaryNum= num1.getImaginaryNum()+num2.getRealNum();
        return new ComplexNum(realNum,imaginaryNum);
    }
}
