//Question Link - https://leetcode.com/problems/design-a-text-editor/

class TextEditor {
    StringBuilder sb;
    int cursor;
    public TextEditor() {
        sb = new StringBuilder();
        cursor = 0;
    }

    public void addText(String text) {
        sb.insert(cursor, text);
        incrementBy(text.length());
    }

    public int deleteText(int k) {
        int currentCursor = cursor;
        
        decrementBy(k);
        sb.delete(cursor, currentCursor);
        
        return currentCursor - cursor;
    }

    public String cursorLeft(int k) {
        decrementBy(k);
        int startPoint = getStartPoint();
        
        return sb.substring(startPoint, cursor);    
    }

    public String cursorRight(int k) {
        incrementBy(k);
        int startPoint = getStartPoint();
        
        return sb.substring(startPoint, cursor);
    }
     
    private void decrementBy(int k) {
        cursor = Math.max(0, cursor - k);
    }
    
    private void incrementBy(int k) {
        cursor = Math.min(cursor + k, sb.length());
    }
    
    private int getStartPoint() {
        return (cursor < 10) ? 0 : cursor - 10;
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */
