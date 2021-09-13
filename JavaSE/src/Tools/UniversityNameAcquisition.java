package Tools;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import javax.swing.text.Document;
import java.io.IOException;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: UniversityNameAcquisition
 * @ProjectName: java-se-learning
 * @Description: 大学名称获取
 * @date: 2021/8/25 15:21
 */
public class UniversityNameAcquisition {
    public static void main(String[] args) {
        try {
            String[] array = new String[100];
            String[] place = new String[100];
            int i = 0;
            Document doc = (Document) Jsoup.connect("https://www.unjs.com").get();
            Elements links = ((Element) doc).select("a[href]");
            for (Element link : links) {
                String linkHref = link.attr("href");
                String linkText = link.text();
                int index = linkHref.indexOf("/daxue/");
                int count = linkHref.indexOf("html");
                int count1 = linkText.indexOf(">>>");
                if (index > 0 && count < 0 && count1 < 0) {
                    if ("全国大学".equals(linkText)) {
                        break;
                    }
                    if (i >= 2) {
                        System.out.println(linkText);
                        String[] split = linkText.split("高");
                        place[i] = split[0];
                        array[i] = linkHref;
                    }
                    i++;
                }

            }
            UniversityNameAcquisition.getschool(array, place);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void getschool(String[] array, String[] array2) {
        Document doc = null;
        int count1 = 1;
        int count2 = 1;
        try {
            for (int j = 2; j < array.length; j++) {
                if (array[j] == null) {
                    break;
                } else {
                    System.out.println(array2[j]);
                    count2++;
                    doc = (Document) Jsoup.connect(array[j]).get();
                    Elements links = ((Element) doc).select("h4");
                    for (Element link : links) {
                        System.out.println(link.text());
                        count1++;

                    }

                }
            }
            System.out.println("一共" + count2 + "个省份" + count1 + "所大学");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
