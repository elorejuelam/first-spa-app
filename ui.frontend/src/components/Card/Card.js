import React, { Component } from 'react';
import cardImage from '../../pianocat.png';
import './Card.css'

export default class Card extends Component {
    render() {
        return(
            <div className="Card">
                <img src={cardImage} 
                className="App-image" alt="cardImage" width="300" height="200"/>
                <p><h2>{this.props.text}</h2></p>
                <p>{this.props.subtitle}</p>
                <a
                    className="App-link"
                    href={this.props.link}
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    {this.props.longText}
                </a>
                <p><img src={process.env.PUBLIC_URL + 'logo192.png'}></img></p>;
            </div>
        );
    }
}