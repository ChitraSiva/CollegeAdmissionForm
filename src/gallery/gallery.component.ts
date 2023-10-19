import { Component } from '@angular/core';

@Component({
  selector: 'app-gallery',
  templateUrl: './gallery.component.html',
  styleUrls: ['./gallery.component.scss']
})
export class GalleryComponent {
  imageUrls: string[] = [
    'https://media.istockphoto.com/id/1282571359/photo/adult-student-in-library-stock-photo.jpg?s=612x612&w=0&k=20&c=L4EJDuT2D0obwraMqYruRqxrXRd17Xg5geEnioTuRFI=',
    'https://media.istockphoto.com/id/1248521772/photo/gifted-black-girl-uses-laptop-writes-notes-for-the-paper-essay-study-for-class-assignment.jpg?s=612x612&w=0&k=20&c=A0edhfi3pw8twj7mrANFmQ0V_opWS72k7cgMr0NyoZI=',
    'https://png.pngtree.com/background/20211216/original/pngtree-portrait-of-seven-college-students-throwing-bachelor-hats-on-the-playground-picture-image_1509540.jpg',
    'https://c8.alamy.com/comp/DJAB1P/college-students-jumping-in-the-park-DJAB1P.jpg',
    'https://images.pond5.com/college-students-playing-football-playground-footage-046330794_iconl.jpeg',
    'https://images.pexels.com/photos/6147276/pexels-photo-6147276.jpeg?auto=compress&cs=tinysrgb&h=627&fit=crop&w=1200'
  ];
}
