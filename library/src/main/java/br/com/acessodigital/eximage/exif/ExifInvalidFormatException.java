package br.com.acessodigital.eximage.exif;

public class ExifInvalidFormatException extends Exception {
    public ExifInvalidFormatException(String meg) {
        super(meg);
    }
}