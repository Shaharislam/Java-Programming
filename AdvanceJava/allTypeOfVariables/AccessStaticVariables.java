package allTypeOfVariables;

public class AccessStaticVariables {
    public static void main(String[] args) {

        // Difference Between Static and Non_Static Instance variable
        // Static variable refer to class not related to object
        StaticVariable obj = new StaticVariable();
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();

        InstanceVariable ins1= new InstanceVariable();
        InstanceVariable ins2= new InstanceVariable();
        InstanceVariable ins3= new InstanceVariable();

        //Static variable object
        obj.totalStaticObject(); // print count = 1;
        obj1.totalStaticObject(); //print count = 2;
        obj2.totalStaticObject(); //print count = 3;

        //Instance Variable Object
        ins1.instanceVariable(); //print count =1;
        ins2.instanceVariable(); //print count =1;
        ins3.instanceVariable(); //print count =1;

        StaticVariable.count++;// Static variable related to class not object for that we can access it by class Name
        ins1.count= 10; // Instance variable related to object for that we can access it by the Object not class name
        InstanceVariable.count2=10;
        ins1.instanceVariable();
        StaticVariable.totalStaticObjectInStaticMethod(); // Static method called by class name
        StaticMethod.staticMethodInAClass(); // static method called by class name it related to class not object;
    }
}
