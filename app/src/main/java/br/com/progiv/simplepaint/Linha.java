package br.com.progiv.simplepaint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class Linha {

    private Path path;
    private Paint paint;

    //Construtor da classe:
    public Linha(Context context, Path path){
        this.path = path;
        this.paint = Estilo.getEstilosParaLinha();
    }

    public void desenharLinha(Canvas canvas){
        canvas.drawPath(path, paint);
    }

}
