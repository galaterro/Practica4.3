
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;

public class Ejecutador {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        File file = new File("archivo.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc =  dBuilder.parse(file);

        System.out.println(doc.getDocumentElement().getNodeName());
        NodeList nl = doc.getElementsByTagName("tabla");

        for (int i = 0; i < nl.getLength(); i++) {
            Node n = nl.item(i);
            System.out.println(n.getNodeName());
        }
    }
}
