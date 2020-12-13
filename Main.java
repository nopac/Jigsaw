import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application
{
	
	static Button b1 = new Button();
	static Button b2 = new Button();
	static Button b3 = new Button();
	static Button b4 = new Button();
	static Button b5 = new Button();
	static Button b6 = new Button();
	static Button b7 = new Button();
	static Button b8 = new Button();
	static Button b9 = new Button();
	final Button ok = new Button("确定");
	final Group group = new Group();
	final Group group1 = new Group();
	final Scene scene = new Scene(group);
	final Scene scene1 = new Scene(group1);
	final Stage over = new Stage();
	final Label label = new Label("完成！");
	
	
	public static void main(String[] args)
	{	
		b1.setLayoutX(200);
		b1.setLayoutY(0);
		b2.setLayoutX(200);
		b2.setLayoutY(400);
		b3.setLayoutX(0);
		b3.setLayoutY(0);
		b4.setLayoutX(0);
		b4.setLayoutY(400);
		b5.setLayoutX(400);
		b5.setLayoutY(0);
		b6.setLayoutX(400);
		b6.setLayoutY(200);
		b7.setLayoutX(200);
		b7.setLayoutY(200);
		b8.setLayoutX(0);
		b8.setLayoutY(200);
		b9.setLayoutX(400);
		b9.setLayoutY(400);
		launch(args);
	}

	public void start(final Stage primaryStage) throws Exception 
	{
		
		final BackgroundImage bgf1 = new BackgroundImage(new Image("/icon/1.gif"), null, null, null, null);
		final Background bgd1 = new Background(bgf1);
		final BackgroundImage bgf2 = new BackgroundImage(new Image("/icon/2.gif"), null, null, null, null);
		final Background bgd2 = new Background(bgf2);
		final BackgroundImage bgf3 = new BackgroundImage(new Image("/icon/3.gif"), null, null, null, null);
		final Background bgd3 = new Background(bgf3);
		final BackgroundImage bgf4 = new BackgroundImage(new Image("/icon/4.gif"), null, null, null, null);
		final Background bgd4 = new Background(bgf4);
		final BackgroundImage bgf5 = new BackgroundImage(new Image("/icon/5.gif"), null, null, null, null);
		final Background bgd5 = new Background(bgf5);
		final BackgroundImage bgf6 = new BackgroundImage(new Image("/icon/6.gif"), null, null, null, null);
		final Background bgd6 = new Background(bgf6);
		final BackgroundImage bgf7 = new BackgroundImage(new Image("/icon/7.gif"), null, null, null, null);
		final Background bgd7 = new Background(bgf7);
		final BackgroundImage bgf8 = new BackgroundImage(new Image("/icon/8.gif"), null, null, null, null);
		final Background bgd8 = new Background(bgf8);
		final BackgroundImage bgf9 = new BackgroundImage(new Image("/icon/9.gif"), null, null, null, null);
		final Background bgd9 = new Background(bgf9);
		
		group.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8);
		
		
		
		
		b1.setPrefHeight(200);
		b1.setPrefWidth(200);
		b1.setBackground(bgd1);
		b1.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{	
				if((group.contains(b1.getLayoutX()+201,b1.getLayoutY()+1)==false)&&(b1.getLayoutX()+200!=600))
				{
					b1.setLayoutX(b1.getLayoutX()+200);
				}
				else if(group.contains(b1.getLayoutX()-1,b1.getLayoutY()+1)==false&&b1.getLayoutX()!=0)
				{
					b1.setLayoutX(b1.getLayoutX()-200);
				}
				else if(group.contains(b1.getLayoutX()+1,b1.getLayoutY()+201)==false&&b1.getLayoutY()+200!=600)
				{
					b1.setLayoutY(b1.getLayoutY()+200);
				}
				else if(group.contains(b1.getLayoutX()+1,b1.getLayoutY()-1)==false&&b1.getLayoutY()!=0)
				{
					b1.setLayoutY(b1.getLayoutY()-200);
				}
				System.out.println(b1.getLayoutX()+" : "+b1.getLayoutY());
				endGame();
			}
		});
		

		b2.setPrefHeight(200);
		b2.setPrefWidth(200);
		b2.setBackground(bgd2);
		b2.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{	
				if((group.contains(b2.getLayoutX()+201,b2.getLayoutY()+1)==false)&&(b2.getLayoutX()+200!=600))
				{
					b2.setLayoutX(b2.getLayoutX()+200);
				}
				else if(group.contains(b2.getLayoutX()-1,b2.getLayoutY()+1)==false&&b2.getLayoutX()!=0)
				{
					b2.setLayoutX(b2.getLayoutX()-200);
				}
				else if(group.contains(b2.getLayoutX()+1,b2.getLayoutY()+201)==false&&b2.getLayoutY()+200!=600)
				{
					b2.setLayoutY(b2.getLayoutY()+200);
				}
				else if(group.contains(b2.getLayoutX()+1,b2.getLayoutY()-1)==false&&b2.getLayoutY()!=0)
				{
					b2.setLayoutY(b2.getLayoutY()-200);
				}
				System.out.println(b2.getLayoutX()+" : "+b2.getLayoutY());
				endGame();
			}
		});
		

		b3.setPrefHeight(200);
		b3.setPrefWidth(200);
		b3.setBackground(bgd3);
		b3.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{				
				if((group.contains(b3.getLayoutX()+201,b3.getLayoutY()+1)==false)&&(b3.getLayoutX()+200!=600))
				{
					b3.setLayoutX(b3.getLayoutX()+200);
				}
				else if(group.contains(b3.getLayoutX()-1,b3.getLayoutY()+1)==false&&b3.getLayoutX()!=0)
				{
					b3.setLayoutX(b3.getLayoutX()-200);
				}
				else if(group.contains(b3.getLayoutX()+1,b3.getLayoutY()+201)==false&&b3.getLayoutY()+200!=600)
				{
					b3.setLayoutY(b3.getLayoutY()+200);
				}
				else if(group.contains(b3.getLayoutX()+1,b3.getLayoutY()-1)==false&&b3.getLayoutY()!=0)
				{
					b3.setLayoutY(b3.getLayoutY()-200);
				}
				System.out.println(b3.getLayoutX()+" : "+b3.getLayoutY());
				endGame();
			}
		});
		

		b4.setPrefHeight(200);
		b4.setPrefWidth(200);
		b4.setBackground(bgd4);
		b4.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{
				if((group.contains(b4.getLayoutX()+201,b4.getLayoutY()+1)==false)&&(b4.getLayoutX()+200!=600))
				{
					b4.setLayoutX(b4.getLayoutX()+200);
				}
				else if(group.contains(b4.getLayoutX()-1,b4.getLayoutY()+1)==false&&b4.getLayoutX()!=0)
				{
					b4.setLayoutX(b4.getLayoutX()-200);
				}
				else if(group.contains(b4.getLayoutX()+1,b4.getLayoutY()+201)==false&&b4.getLayoutY()+200!=600)
				{
					b4.setLayoutY(b4.getLayoutY()+200);
				}
				else if(group.contains(b4.getLayoutX()+1,b4.getLayoutY()-1)==false&&b4.getLayoutY()!=0)
				{
					b4.setLayoutY(b4.getLayoutY()-200);
				}
				System.out.println(b4.getLayoutX()+" : "+b4.getLayoutY());
				endGame();
			}
		});
		

		b5.setPrefHeight(200);
		b5.setPrefWidth(200);
		b5.setBackground(bgd5);
		b5.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{
				if((group.contains(b5.getLayoutX()+201,b5.getLayoutY()+1)==false)&&(b5.getLayoutX()+200!=600))
				{
					b5.setLayoutX(b5.getLayoutX()+200);
				}
				else if(group.contains(b5.getLayoutX()-1,b5.getLayoutY()+1)==false&&b5.getLayoutX()!=0)
				{
					b5.setLayoutX(b5.getLayoutX()-200);
				}
				else if(group.contains(b5.getLayoutX()+1,b5.getLayoutY()+201)==false&&b5.getLayoutY()+200!=600)
				{
					b5.setLayoutY(b5.getLayoutY()+200);
				}
				else if(group.contains(b5.getLayoutX()+1,b5.getLayoutY()-1)==false&&b5.getLayoutY()!=0)
				{
					b5.setLayoutY(b5.getLayoutY()-200);
				}
				System.out.println(b5.getLayoutX()+" : "+b5.getLayoutY());
				endGame();
			}
		});
		

		b6.setPrefHeight(200);
		b6.setPrefWidth(200);
		b6.setBackground(bgd6);
		b6.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{
				if((group.contains(b6.getLayoutX()+201,b6.getLayoutY()+1)==false)&&(b6.getLayoutX()+200!=600))
				{
					b6.setLayoutX(b6.getLayoutX()+200);
				}
				else if(group.contains(b6.getLayoutX()-1,b6.getLayoutY()+1)==false&&b6.getLayoutX()!=0)
				{
					b6.setLayoutX(b6.getLayoutX()-200);
				}
				else if(group.contains(b6.getLayoutX()+1,b6.getLayoutY()+201)==false&&b6.getLayoutY()+200!=600)
				{
					b6.setLayoutY(b6.getLayoutY()+200);
				}
				else if(group.contains(b6.getLayoutX()+1,b6.getLayoutY()-1)==false&&b6.getLayoutY()!=0)
				{
					b6.setLayoutY(b6.getLayoutY()-200);
				}
				System.out.println(b6.getLayoutX()+" : "+b6.getLayoutY());
				endGame();
			}
		});
		

		b7.setPrefHeight(200);
		b7.setPrefWidth(200);
		b7.setBackground(bgd7);
		b7.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{
				if((group.contains(b7.getLayoutX()+201,b7.getLayoutY()+1)==false)&&(b7.getLayoutX()+200!=600))
				{
					b7.setLayoutX(b7.getLayoutX()+200);
				}
				else if(group.contains(b7.getLayoutX()-1,b7.getLayoutY()+1)==false&&b7.getLayoutX()!=0)
				{
					b7.setLayoutX(b7.getLayoutX()-200);
				}
				else if(group.contains(b7.getLayoutX()+1,b7.getLayoutY()+201)==false&&b7.getLayoutY()+200!=600)
				{
					b7.setLayoutY(b7.getLayoutY()+200);
				}
				else if(group.contains(b7.getLayoutX()+1,b7.getLayoutY()-1)==false&&b7.getLayoutY()!=0)
				{
					b7.setLayoutY(b7.getLayoutY()-200);
				}
				System.out.println(b7.getLayoutX()+" : "+b7.getLayoutY());
				endGame();
			}
		});
		

		b8.setPrefHeight(200);
		b8.setPrefWidth(200);
		b8.setBackground(bgd8);
		b8.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{
				if((group.contains(b8.getLayoutX()+201,b8.getLayoutY()+1)==false)&&(b8.getLayoutX()+200!=600))
				{
					b8.setLayoutX(b8.getLayoutX()+200);
				}
				else if(group.contains(b8.getLayoutX()-1,b8.getLayoutY()+1)==false&&b8.getLayoutX()!=0)
				{
					b8.setLayoutX(b8.getLayoutX()-200);
				}
				else if(group.contains(b8.getLayoutX()+1,b8.getLayoutY()+201)==false&&b8.getLayoutY()+200!=600)
				{
					b8.setLayoutY(b8.getLayoutY()+200);
				}
				else if(group.contains(b8.getLayoutX()+1,b8.getLayoutY()-1)==false&&b8.getLayoutY()!=0)
				{
					b8.setLayoutY(b8.getLayoutY()-200);
				}
				System.out.println(b8.getLayoutX()+" : "+b8.getLayoutY());
				endGame();
			}
		});
		

		b9.setPrefHeight(200);
		b9.setPrefWidth(200);
		b9.setBackground(bgd9);
		b9.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{
				if((group.contains(b9.getLayoutX()+201,b9.getLayoutY()+1)==false)&&(b9.getLayoutX()+200!=600))
				{
					b9.setLayoutX(b9.getLayoutX()+200);
				}
				else if(group.contains(b9.getLayoutX()-1,b9.getLayoutY()+1)==false&&b9.getLayoutX()!=0)
				{
					b9.setLayoutX(b9.getLayoutX()-200);
				}
				else if(group.contains(b9.getLayoutX()+1,b9.getLayoutY()+201)==false&&b9.getLayoutY()+200!=600)
				{
					b9.setLayoutY(b9.getLayoutY()+200);
				}
				else if(group.contains(b9.getLayoutX()+1,b9.getLayoutY()-1)==false&&b9.getLayoutY()!=0)
				{
					b9.setLayoutY(b9.getLayoutY()-200);
				}
				System.out.println(b9.getLayoutX()+" : "+b9.getLayoutY());
				endGame();
			}
		});
		
		ok.setLayoutX(95);
		ok.setLayoutY(150);
		ok.setPrefHeight(50);
		ok.setPrefWidth(100);
		ok.setOnAction(new EventHandler<ActionEvent>() 
		{
			public void handle(ActionEvent event) 
			{
				over.close();
				primaryStage.close();
			}
		});
		
		label.setLayoutX(114);
		label.setLayoutY(60);
		label.setFont(Font.font(30));
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(648);
		primaryStage.setWidth(620);
		primaryStage.setTitle("拼图游戏");
		primaryStage.getIcons().add(new Image("/icon/timg.jpg"));
		this.endGame();
		primaryStage.show();
	}
	
	public void endGame()
	{
		if(	b1.getLayoutX()==0 && b1.getLayoutY()==0 &&
			b2.getLayoutX()==200 && b2.getLayoutY()==0 &&
			b3.getLayoutX()==400 && b3.getLayoutY()==0 &&
			b4.getLayoutX()==0 && b4.getLayoutY()==200 &&
			b5.getLayoutX()==200 && b5.getLayoutY()==200 &&
			b6.getLayoutX()==400 && b6.getLayoutY()==200 &&
			b7.getLayoutX()==0 && b7.getLayoutY()==400 &&
			b8.getLayoutX()==200 && b8.getLayoutY()==400 )
		{	
			
			group.getChildren().add(b9);
			group1.getChildren().addAll(ok,label);
			over.setScene(scene1);
			over.getIcons().add(new Image("/icon/timg.jpg"));
			over.setWidth(300);
			over.setHeight(300);
			over.setTitle("拼图游戏");
			over.setAlwaysOnTop(true);
			over.show();
		}
	}
}
