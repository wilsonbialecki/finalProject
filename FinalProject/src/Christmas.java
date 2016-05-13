import java.awt.*;

import javax.swing.JFrame;
public class Christmas extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				 Christmas canvas = new Christmas();
			        JFrame frame = new JFrame();
			        frame.setSize(500, 500);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.black);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);

			}
		public void paint(Graphics graphics) 
			{
				  
    	    		    		  int[] xArray={200,250,300};
  	    						int[] yArray={100,10,100};
  	    						graphics.setColor(Color.green);
  	    						graphics.fillPolygon(xArray,yArray,3);
  	    					  int[] xArray2={200,250,300};
	    						int[] yArray2={150,10,150};
	    						graphics.setColor(Color.green);
	    						graphics.fillPolygon(xArray2,yArray2,3);
	    						 int[] xArray3={175,250,325};
	  	    						int[] yArray3={200,10,200};
	  	    						graphics.setColor(Color.green);
	  	    						graphics.fillPolygon(xArray3,yArray3,3);
	  	    						 int[] xArray4={175,250,325};
		  	    						int[] yArray4={300,10,300};
		  	    						graphics.setColor(Color.green);
		  	    						graphics.fillPolygon(xArray4,yArray4,3);
		  	    						 int[] xArray5={175,250,325};
			  	    						int[] yArray5={400,10,400};
			  	    						graphics.setColor(Color.green);
			  	    						graphics.fillPolygon(xArray5,yArray5,3);
			  	    						
			  	    						
			  	    						for(int r=0; r < 255; r++)
			  	    	    		    	  {
			  	    	    		    		    	    		   		    		  
			  	    	    		    		 for(int g=0; g < 255; g++)
			  	    	    	    		      {
			  	    	    	    		    		  		    		     	  	    		        
			  	    	    	    		    	  
			  	    	    	    		      for(int b=0; b < 255; b++)
			  	    	    	    		    	  {
			  	    	    	    		    		  for(int x=0; x<500;x+=30 )
			  	    	    	    		    			  {
			  	    	    	    		    				  for(int y=0; y<500;y+=30 )
			  	    	    	    		    					  {
    	    	    		    				 
			  	    	    	    		    						graphics.setColor(new Color(g,r,b)); 
    	    	    		    				  						graphics.fillOval(x, y, 10, 10);
    	    	    		    				 
    	    	    		    				  						graphics.setColor(new Color(139,80,14));
    	    	    		    				  						graphics.fillRect(230, 400, 40, 100);
    	    	    		    				  
    	    	    		    				  						graphics.setColor(Color.black);
    	    	    		    				  						graphics.fillRect(180, 400, 50, 100);
    	    	    		    				  
    	    	    		    				  						graphics.setColor(Color.black);
    	    	    		    				  						graphics.fillRect(270, 400, 50, 100);
    	    	    		    				  
    	    	    		    				  						graphics.setColor(Color.black);
    	    	    		    				  						graphics.fillRect(0, 0, 175, 500);
    	    	    		    				  
    	    	    		    				  						graphics.setColor(Color.black);
    	    	    		    				  						graphics.fillRect(325, 0, 500, 500);
    	    	    		    				  
    	    	    		    				  						int[] xArray6={250,300,400};
    	    	    		    				  						int[] yArray6={10,100,50};
    	    	    		    				  						graphics.setColor(Color.black);
    	    	    		    				  						graphics.fillPolygon(xArray6,yArray6,3);
    	    	    		    				  						int[] xArray7={275,325,400};
    	    	    		    				  						int[] yArray7={100,200,100};
    	    	    		    				  						graphics.setColor(Color.black);
    	    	    		    				  						graphics.fillPolygon(xArray7,yArray7,3);
    				  	    					
			  	    	    	    		    					  }
			  	    	    	    		    			  }
			  	    	    	    		    	  }
			  	    	    	    		      }
			  	    	    		    	  }
			}
		public void delay()
			{
	        try
					{
					Thread.sleep(0);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}

	}
