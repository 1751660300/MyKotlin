package a5图片处理

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    //创建宽高为100的图片
    var image = BufferedImage(100,100,BufferedImage.TYPE_INT_RGB)
    image.setRGB(0,0,0xff0000)
    image.apply {
        setRGB(99,99,0x0000ff)
    }
    ImageIO.write(image,"bmp", File("a.bmp"))
}