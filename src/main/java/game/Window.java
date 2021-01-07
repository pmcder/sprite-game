package game;

import javax.swing.JFrame;
import States.StateManager;
import graphics.Assets;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Window extends JFrame implements Runnable {


	private static final long serialVersionUID = 1L;
	
	private Canvas canvas = new Canvas();
	
	private GameKeyAdapter gameKeyAdapter;
	
	private StateManager stateManager;
	
	private GameKeyListener gameKeyListener;
	
	private BufferStrategy strategy;
	

	/**
	 * Window constructor initializes GUI objects
	 * and sets initial state.
	 * @param title is displayed on bar of GUI window.
	 */
	public Window(String title) {
		super(title); 
		this.gameKeyAdapter = new GameKeyAdapter();
		this.stateManager = new StateManager(gameKeyAdapter);
		Assets.init();
		gameKeyListener = new GameKeyListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600); 
		add(canvas);
		setResizable(false);
		setFocusable(true);
		canvas.addKeyListener(gameKeyAdapter);
		canvas.setVisible(true);
		canvas.setSize(600, 600);
		addKeyListener(gameKeyAdapter); 
		canvas.addKeyListener(gameKeyListener);
	}
	
	
	@Override
	public void run() {
        while (true) {
           tick();  
           render(); 
			try {
				Thread.sleep(110); //100
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.exit(1);
			}
        }
    }
	
	public void render() {
		try {
		this.stateManager.getCurrentState().render(canvas.getGraphics());
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public void tick() {
		this.stateManager.getCurrentState().tick();
	}


	public StateManager getStateManager() {
		return stateManager;
	}


	public void setStateManager(StateManager stateManager) {
		this.stateManager = stateManager;
	}
}
