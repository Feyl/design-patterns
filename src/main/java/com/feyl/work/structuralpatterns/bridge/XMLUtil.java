package com.feyl.work.structuralpatterns.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author Feyl
 * @date 2021/10/12 16:28
 */
public class XMLUtil {
    public static Object getBean(String arg){
        try {
            //创建DOM文档对象
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("src/main/resources/bridgeConfig.xml"));

            //获取包含类名的文本结点
            NodeList nl =doc.getElementsByTagName("className");
            Node classNode = null;
            if("vehicle".equals(arg)){
                classNode = nl.item(0).getFirstChild();
            }else if("road".equals(arg)){
                classNode = nl.item(1).getFirstChild();
            }
            String cName = classNode.getNodeValue();

            //通过类名生成实例兑现搞并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
