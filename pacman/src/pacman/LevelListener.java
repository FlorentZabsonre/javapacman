/*
 * Une interface que doivent implementer les objets qui veulent écouter les événements de niveau
 * */
package pacman;

public interface LevelListener {
	
	public void levelUp();
	public void beginBurstMode();
	public void endBurstMode();

}
