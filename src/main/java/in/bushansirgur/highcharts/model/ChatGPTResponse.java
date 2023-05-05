package in.bushansirgur.highcharts.model;

import java.util.List;

public class ChatGPTResponse {

    private List<ChatGPTChoice> choices;

    public List<ChatGPTChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<ChatGPTChoice> choices) {
        this.choices = choices;
    }
}
