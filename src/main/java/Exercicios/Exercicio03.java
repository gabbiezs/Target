package Exercicios;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Exercicio03 {

	public static void main(String[] args) {
		try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse("dados.xml");
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("faturamento");
            double[] faturamentoDiario = new double[nodeList.getLength()];
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    faturamentoDiario[i] = Double.parseDouble(element.getTextContent());
                }
            }
            double menorFaturamento = faturamentoDiario[0];
            double maiorFaturamento = faturamentoDiario[0];
            double somaFaturamento = 0.0;
            int diasAcimaMedia = 0;
            for (double faturamento : faturamentoDiario) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
            }
            double mediaFaturamento = somaFaturamento / faturamentoDiario.length;
            for (double faturamento : faturamentoDiario) {
                if (faturamento > mediaFaturamento) {
                    diasAcimaMedia++;
                }
            }
            System.out.println("Menor valor de faturamento diário: R$" + menorFaturamento);
            System.out.println("Maior valor de faturamento diário: R$" + maiorFaturamento);
            System.out.println("Número de dias com faturamento diário acima da média: " + diasAcimaMedia);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}