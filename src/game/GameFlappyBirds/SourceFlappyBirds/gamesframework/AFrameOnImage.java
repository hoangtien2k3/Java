/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.game.GameFlappyBirds.SourceFlappyBirds.gamesframework;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 *
 * @author hoangtien2k3qx1
 */
public class AFrameOnImage {
    
    private boolean enablePaintRect = false;
    
    private int []DimsBounds = new int[4];
    
    public AFrameOnImage(int xOnImage, int yOnImage, int w, int h){
        DimsBounds[0] = xOnImage;
        DimsBounds[1] = yOnImage;
        DimsBounds[2] = w;
        DimsBounds[3] = h;
    }
    public void VisibleRectDebug(boolean enable){
        enablePaintRect = enable;
    }
    public int[] GetBounds(){
        return DimsBounds;
    }
    public void Paint(int x, int y, BufferedImage image, Graphics2D g2, int anchor, float rotation){
        

        BufferedImage imageDraw = image.getSubimage(DimsBounds[0], DimsBounds[1], DimsBounds[2], DimsBounds[3]);
        
        AffineTransform tx = new AffineTransform();
        tx.rotate(rotation, imageDraw.getWidth() / 2, imageDraw.getHeight() / 2);

        AffineTransformOp op = new AffineTransformOp(tx,
            AffineTransformOp.TYPE_BILINEAR);
        imageDraw = op.filter(imageDraw, null);
        
        
        g2.drawImage(imageDraw, x, y, null);
        
        if(enablePaintRect) PaintBound(g2);
    }
    private void PaintBound(Graphics2D g){
        
    }
}
