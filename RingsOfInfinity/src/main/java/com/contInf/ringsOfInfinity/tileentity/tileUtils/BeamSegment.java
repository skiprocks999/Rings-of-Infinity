package com.contInf.ringsOfInfinity.tileentity.tileUtils;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BeamSegment {
    /** RGB (0 to 1.0) colors of this beam segment */
    private final float[] colors;
    private int height;

    public BeamSegment(float[] colorsIn, int height) {
       this.colors = colorsIn;
       this.height = height;
    }
    
    /**
     * Returns RGB (0 to 1.0) colors of this beam segment
     */
    @OnlyIn(Dist.CLIENT)
    public float[] getColors() {
       return this.colors;
    }

    @OnlyIn(Dist.CLIENT)
    public int getHeight() {
       return this.height;
    }
 }
