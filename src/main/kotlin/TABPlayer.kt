package de.heimbrodt.tabplayer

data class Player(
    var exp: Int = 0,
    var level: Int = 1
)

class TABPlayer() {
    private var p: Player = Player()
    init {

    }
    public fun tickExp(distance: Float) {
        p.exp += (distance).toInt()
        this.updateLevel()
    }
    private fun updateLevel() {
        if(p.exp >= p.level*100+(p.level*p.level*0.5)) {
            p.exp -= p.level*100+(p.level*p.level*0.5).toInt()
            p.level++
        }
    }
    public fun getPlayer(): Player {
        return p
    }
}