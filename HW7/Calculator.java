public class Calculator {
    private Viewer viewer;

    public Calculator() {
        this.viewer = viewer;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }
    public ComplexNum complexNum(ComplexNum num1, ComplexNum num2){
        if (viewer != null){
            return viewer.calc(num1,num2);
        }else
            System.out.println("Операция не задана");
        return num1;
    }
}
