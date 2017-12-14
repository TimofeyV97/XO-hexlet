package io.hexlet.xo.controllers;

import io.hexlet.xo.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.exceptions.InvalidPointException;
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field, final Figure figure, final Point point) throws InvalidPointException,
                                                                                            AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }
}

