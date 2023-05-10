fun onRadioButtonClicked(view: View) {
    if (view is RadioButton) {
        // Is the button now checked?
        val checked = view.isChecked

        // Check which radio button was clicked
        when (view.getId()) {
            R.id.//resource name ->
                if (checked) {
                    // Pirates are the best
                }
            R.id.// resource name ->
                if (checked) {
                    // Ninjas rule
                }
        }
    }
}
