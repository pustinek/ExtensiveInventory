package me.pustinek.extensiveinventory.content;

public class SlotPos {

    private final int row;
    private final int column;

    public SlotPos(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        SlotPos slotPos = (SlotPos) obj;

        return row == slotPos.row && column == slotPos.column;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + column;

        return result;
    }

    public int getRow() { return row; }

    public int getColumn() { return column; }

    public int getIndex() { return row * 9 + column; }

    public static SlotPos of(int row, int column) {
        return new SlotPos(row, column);
    }

    public static SlotPos of(int index) {
        return new SlotPos(index / 9, index % 9);
    }
}
