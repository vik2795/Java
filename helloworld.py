import flet as ft

def main(page: ft.Page) -> None:
    page.add(ft.Text(value="Hello World!",color=ft.colors.PURPLE_300))
    page.update()


if __name__=='__main__':
    ft.app(target=main)