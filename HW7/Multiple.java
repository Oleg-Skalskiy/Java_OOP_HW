public class Multiple  implements Viewer{
    @Override
    public ComplexNum calc(ComplexNum num1, ComplexNum num2) {
        double realNum = num1.getRealNum() * num2.getRealNum() - num1.getImaginaryNum() * num2.getImaginaryNum();
        double imaginaryNum = num1.getRealNum() * num2.getImaginaryNum() + num1.getImaginaryNum() * num2.getRealNum();
        return new ComplexNum(realNum, imaginaryNum);
    }
}
