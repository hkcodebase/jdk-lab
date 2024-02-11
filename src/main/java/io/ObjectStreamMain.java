package src.main.java.io;

import java.io.*;

public class ObjectStreamMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject();
        readObject();
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("files/objectOutput.txt"));
        Object dataClassReadObject1 =  objectInputStream.readObject();
        Object dataClassReadObject2 =  objectInputStream.readObject();
        System.out.printf("is object from file instance of Dataclass %s",dataClassReadObject1 instanceof DataClass);
        System.out.printf("is two object created using read object are equal %s", dataClassReadObject2 == dataClassReadObject1);
    }

    private static void writeObject() throws IOException {
        DataClass dataClassWriteObj = new DataClass();
        dataClassWriteObj.setCity("Delhi");
        dataClassWriteObj.setName("Oberoy");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("files/objectOutput.txt"));
        objectOutputStream.writeObject(dataClassWriteObj);
        objectOutputStream.writeObject(dataClassWriteObj);
    }
}

class  DataClass implements Serializable{
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
