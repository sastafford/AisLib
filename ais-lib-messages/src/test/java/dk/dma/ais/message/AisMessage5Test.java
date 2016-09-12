package dk.dma.ais.message;

import dk.dma.ais.binary.SixbitException;
import dk.dma.ais.sentence.SentenceException;
import dk.dma.ais.sentence.Vdm;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by sstafford on 9/12/2016.
 */
public class AisMessage5Test {
    
    @Test
    public void marshalAisMessage5Test() throws AisMessageException, SixbitException, SentenceException, JAXBException, ParserConfigurationException {
        AisMessage5 msg5 = new AisMessage5();
        msg5.setUserId(123);
        msg5.setName("boom");
        msg5.setDest("Hawaii");
        JAXBContext jc = JAXBContext.newInstance(AisMessage5.class);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();
        Marshaller m = jc.createMarshaller();
        System.out.println("marshal");
        m.marshal( msg5, System.out );
    }

}
