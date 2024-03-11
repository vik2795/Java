import flet as ft

def main(page: ft.Page):
    page.title = "Dolgozat"
    page.vertical_alignment = ft.MainAxisAlignment.CENTER
    page.horizontal_alignment = ft.CrossAxisAlignment.CENTER
  
 
      
    page.add(
        ft.Row(
            [
                  ft.Container(
                
                    margin=10,
                    padding=0,
                    alignment=ft.alignment.center,
                    bgcolor=ft.colors.BLUE_300,
                    width=800,
                    height=200,
                    border_radius=0,
                    content=ft.Text("A"),
                    expand=True,
                    
                                ),
            ],
        ),
    ),
           
            
        
    
    
    page.add(
        
     
        ft.Row(
            [
                  ft.Container(
                
                    margin=10,
                    padding=0,
                    alignment=ft.alignment.center,
                    bgcolor=ft.colors.YELLOW,
                    width=200,
                    height=200,
                    border_radius=0,
                    
                ),
                
            
                ft.Container(
                
                    margin=10,
                    padding=0,
                    alignment=ft.alignment.center,
                    bgcolor=ft.colors.BLUE,
                    width=200,
                    height=200,
                    border_radius=0,
                ),
                ft.Container(
                
                    margin=10,
                    padding=0,
                    alignment=ft.alignment.center,
                    bgcolor=ft.colors.GREEN,
                    width=200,
                    height=200,
                    border_radius=0,
                ),

                ft.Container(
                
                    margin=10,
                    padding=0,
                    alignment=ft.alignment.center,
                    bgcolor=ft.colors.BLACK,
                    width=200,
                    height=200,
                    border_radius=0,
                ),
                ft.Container(
                
                    margin=10,
                    padding=0,
                    alignment=ft.alignment.center,
                    bgcolor=ft.colors.RED,
                    width=200,
                    height=200,
                    border_radius=0,
                ),
           
           
           
           
                
              
              
            ],
            alignment=ft.MainAxisAlignment.CENTER,
        ),
    )

ft.app(target=main)