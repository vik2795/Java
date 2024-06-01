import flet as ft

def main(page: ft.Page):
    page.bgcolor = ft.colors.CYAN_50
    page.scroll = ft.ScrollMode.AUTO
    text_field = ft.TextField(label="Név")
    switch = ft.Switch(value=False, label="Egyetért a nyilatkozattal")
    radio_options = ["Férfi", "Nő", "Egyéb"]
    dropdown_options = ["Gyerek", "Fiatal Felnőtt", "Felnőtt","Idős"]
    slider = ft.Slider(value=50, min=0, max=100)

    radio_group = ft.RadioGroup(
        content=ft.Column(
            [
                ft.Radio(value=option, label=option)
                for option in radio_options
            ]
        )
    )

    dropdown = ft.Dropdown(
        options=[ft.dropdown.Option(option) for option in dropdown_options],
        value=dropdown_options[0]
    )

    def validate_form():
        errors = []
        if not text_field.value:
            errors.append("A név mező kitöltése kötelező!")
        if not switch.value:
            errors.append("Kötelező egyet értenie a nyilatkozatokkal!")
        if not radio_group.value:
            errors.append("Válasszon az opciók közül!")
        return errors

    def submit_form(e):
        errors = validate_form()
        if errors:
            result_text.value = "Hiba a kitöltés során!:\n" + "\n".join(errors)
        else:
            result_text.value = (
                f"Name: {text_field.value}\n"
                f"Agreed to terms: {switch.value}\n"
                f"Selected option: {radio_group.value}\n"
                f"Dropdown selection: {dropdown.value}\n"
                f"Slider value: {slider.value}"
            )
        page.update()

    submit_button = ft.ElevatedButton(text="Submit", on_click=submit_form)

    result_text = ft.Text()

    form_layout = ft.Column(
        controls=[
            text_field,
            switch,
            ft.Text("Neme:"),
            radio_group,
            ft.Text("Milyen korosztályba tartozik?:"),
            dropdown,
            ft.Text("Nyugodtan cibálja a csúszkát:"),
            slider,
            submit_button
        ],
        spacing=10
    )

    page.add(form_layout)

    page.add(result_text)

ft.app(target=main)