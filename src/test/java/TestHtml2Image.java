import gui.ava.html.image.generator.HtmlImageGenerator;

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
//        htmlImageGenerator.loadUrl("");
        //保存生成的图片
        htmlImageGenerator.saveAsImage("d:/hello-world.png");
    }
}
