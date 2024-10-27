class Player {
    private String name;
    private char symbol;
    private Integer health;
    private Integer x;
    private Integer y;
    private Integer prevX;
    private Integer prevY;
//    private World myWorld;

    public Player(String name, Integer x, Integer y) {
        this.name = name;
        this.symbol = symbol;
        this.health = health;
        this.x = x;
        this.y = y;
//        this.myWorld = myWorld;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getPrevX() {
        return prevX;
    }

    public void setPrevX(Integer prevX) {
        this.prevX = prevX;
    }

    public Integer getPrevY() {
        return prevY;
    }

    public void setPrevY(Integer prevY) {
        this.prevY = prevY;
    }
}
