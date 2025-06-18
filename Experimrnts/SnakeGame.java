// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// import java.util.Random;

// public class SnakeGame extends JFrame {
//     public SnakeGame() {
//         add(new GamePanel());
//         setResizable(false);
//         pack();
//         setTitle("Snake Game");
//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(SnakeGame::new);
//     }
// }

// class GamePanel extends JPanel implements ActionListener {
//     private final int TILE_SIZE = 25;
//     private final int BOARD_WIDTH = 25;
//     private final int BOARD_HEIGHT = 25;
//     private final int SCREEN_WIDTH = BOARD_WIDTH * TILE_SIZE;
//     private final int SCREEN_HEIGHT = BOARD_HEIGHT * TILE_SIZE;
//     private final int[] x = new int[BOARD_WIDTH * BOARD_HEIGHT];
//     private final int[] y = new int[BOARD_WIDTH * BOARD_HEIGHT];
//     private int snakeLength;
//     private int foodX, foodY;
//     private char direction = 'R'; // L = Left, R = Right, U = Up, D = Down
//     private boolean running = false;
//     private Timer timer;
//     private Random random;

//     public GamePanel() {
//         setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
//         setBackground(Color.BLACK);
//         setFocusable(true);
//         addKeyListener(new KeyAdapter() {
//             @Override
//             public void keyPressed(KeyEvent e) {
//                 switch (e.getKeyCode()) {
//                     case KeyEvent.VK_UP:
//                         if (direction != 'D') direction = 'U';
//                         break;
//                     case KeyEvent.VK_DOWN:
//                         if (direction != 'U') direction = 'D';
//                         break;
//                     case KeyEvent.VK_LEFT:
//                         if (direction != 'R') direction = 'L';
//                         break;
//                     case KeyEvent.VK_RIGHT:
//                         if (direction != 'L') direction = 'R';
//                         break;
//                 }
//             }
//         });
//         startGame();
//     }

//     private void startGame() {
//         random = new Random();
//         snakeLength = 3;
//         for (int i = 0; i < snakeLength; i++) {
//             x[i] = TILE_SIZE * (snakeLength - i - 1);
//             y[i] = 0;
//         }
//         spawnFood();
//         running = true;
//         timer = new Timer(100, this);
//         timer.start();
//     }

//     private void spawnFood() {
//         foodX = random.nextInt(BOARD_WIDTH) * TILE_SIZE;
//         foodY = random.nextInt(BOARD_HEIGHT) * TILE_SIZE;
//     }

//     private void move() {
//         for (int i = snakeLength - 1; i > 0; i--) {
//             x[i] = x[i - 1];
//             y[i] = y[i - 1];
//         }

//         switch (direction) {
//             case 'U' -> y[0] -= TILE_SIZE;
//             case 'D' -> y[0] += TILE_SIZE;
//             case 'L' -> x[0] -= TILE_SIZE;
//             case 'R' -> x[0] += TILE_SIZE;
//         }
//     }

//     private void checkCollision() {
//         // Check collision with walls
//         if (x[0] < 0 || x[0] >= SCREEN_WIDTH || y[0] < 0 || y[0] >= SCREEN_HEIGHT) {
//             running = false;
//         }
//         // Check collision with itself
//         for (int i = 1; i < snakeLength; i++) {
//             if (x[0] == x[i] && y[0] == y[i]) {
//                 running = false;
//             }
//         }
//         if (!running) timer.stop();
//     }

//     private void checkFood() {
//         if (x[0] == foodX && y[0] == foodY) {
//             snakeLength++;
//             spawnFood();
//         }
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if (running) {
//             move();
//             checkFood();
//             checkCollision();
//         }
//         repaint();
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         if (running) {
//             // Draw food
//             g.setColor(Color.RED);
//             g.fillRect(foodX, foodY, TILE_SIZE, TILE_SIZE);

//             // Draw snake
//             for (int i = 0; i < snakeLength; i++) {
//                 if (i == 0) {
//                     g.setColor(Color.GREEN); // Snake's head
//                 } else {
//                     g.setColor(Color.LIGHT_GRAY); // Snake's body
//                 }
//                 g.fillRect(x[i], y[i], TILE_SIZE, TILE_SIZE);
//             }
//         } else {
//             showGameOver(g);
//         }
//     }

//     private void showGameOver(Graphics g) {
//         String message = "Game Over";
//         String scoreMessage = "Score: " + (snakeLength - 3);
//         g.setColor(Color.RED);
//         g.setFont(new Font("Arial", Font.BOLD, 40));
//         FontMetrics metrics = getFontMetrics(g.getFont());
//         g.drawString(message, (SCREEN_WIDTH - metrics.stringWidth(message)) / 2, SCREEN_HEIGHT / 3);
//         g.setFont(new Font("Arial", Font.PLAIN, 25));
//         metrics = getFontMetrics(g.getFont());
//         g.drawString(scoreMessage, (SCREEN_WIDTH - metrics.stringWidth(scoreMessage)) / 2, SCREEN_HEIGHT / 2);
//     }
// }
