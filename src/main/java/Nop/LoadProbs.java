package Nop;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProbs {
    static Properties props;

    static FileInputStream inputStream;

    public String getProperty(String Key){
        props =new Properties();


        try {
            inputStream = new FileInputStream("src\\test\\Resource\\TestData\\testdataConfig.properties");
            props.load(inputStream);
            inputStream.close();
        }catch (java.io.IOException e){
            e.printStackTrace();
        }
        return props.getProperty(Key);


    }


}
