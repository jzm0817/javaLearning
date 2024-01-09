


public class TemplateClass<T>{

    private T param0; 

    public T getParam0(){
        return param0;
    }

    public void setParam0(T param0){
        this.param0 = param0;
    }

    public TemplateClass(){

    }

    public TemplateClass(T param0){
        this.param0 = param0;
    }

}