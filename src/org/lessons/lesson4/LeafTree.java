package org.lessons.lesson4;

public abstract class LeafTree extends Tree{
    private boolean hasLeafs;

    public LeafTree(int height, boolean hasLeafs) {
        super(height);
        this.hasLeafs = hasLeafs;
    }
}
