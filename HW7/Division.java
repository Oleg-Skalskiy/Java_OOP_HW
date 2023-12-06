public class Division implements Viewer{

    @Override
    public ComplexNum calc(ComplexNum num1, ComplexNum num2) {
        double div= num2.getRealNum()*num2.getRealNum()+num2.getImaginaryNum()*num2.getImaginaryNum();
        double real=(num1.getRealNum()*num2.getRealNum()+num1.getImaginaryNum()*num2.getImaginaryNum())/div;
        double imaginaryNum=(num1.getImaginaryNum()*num2.getRealNum()-num1.getRealNum()*num2.getImaginaryNum()/div);
        return new ComplexNum(real,imaginaryNum);
    }
}
