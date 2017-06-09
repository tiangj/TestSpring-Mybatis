import gui.ava.html.image.generator.HtmlImageGenerator;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.net.URL;

/**
 * Created by admin on 2017/6/5.
 * 测试html转image
 */
public class TestHtml2Image
{
    public static void main(String[] args){
        HtmlImageGenerator htmlImageGenerator=new HtmlImageGenerator();

        String htmlStr = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>CSS外联样式表</title>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "<p class='p1' style=\"font-size:36px;font-weight:200;color:#0000FF;\">CSS外联样式表</p>\n" +
                "<p class='p2' style=\"font-size:24px;font-weight:300;color: #FF0000;\">CSS外联样式表</p>\n" +
                "<p class='p3'>CSS外联样式表</p>\n" +
                "<p class='p4'>CSS外联样式表 </p>\n" +
                "</body>\n" +
                "</html>";

        //加载本地的html文本
        htmlImageGenerator.loadHtml(htmlStr);
        //加载链接的url地址
//        htmlImageGenerator.loadUrl("http://www.ixingtu.com/");

        //设置图片的大小
//        Dimension dimension=new Dimension();
//        dimension.setSize(200,50);
//        htmlImageGenerator.setSize(dimension);

        //保存生成的图片
        htmlImageGenerator.saveAsImage("d:/hello-world.png");

        try {
            TestHtml2Image.generateOutput();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成图片的方法(html转image)
     * @throws Exception
     */
    protected static void generateOutput() throws Exception {

        //load the webpage into the editor
        JEditorPane ed = new JEditorPane(new URL("http://www.tuicool.com/articles/iAneem"));
//        JEditorPane ed = new JEditorPane(new URL("http://www.hefeipet.com/client/chongwuzhishi/shenghuozatan/2012/0220/95.html"));
        ed.setSize(200,200);

        //create a new image
        BufferedImage image = new BufferedImage(ed.getWidth(), ed.getHeight(),
                BufferedImage.TYPE_INT_ARGB);

        //paint the editor onto the image
        SwingUtilities.paintComponent(image.createGraphics(),
                ed,
                new JPanel(),
                0, 0, image.getWidth(), image.getHeight());
        //save the image to file
        ImageIO.write((RenderedImage)image, "png", new File("d:/hello-world-1.png"));
    }
}
