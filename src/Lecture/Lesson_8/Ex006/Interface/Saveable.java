package Lecture.Lesson_8.Ex006.Interface;

import Lecture.Lesson_8.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
