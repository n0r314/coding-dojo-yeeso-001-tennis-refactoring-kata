import { TennisGame } from './TennisGame';

export class TennisGameImpl implements TennisGame {
  private p2: number = 0;
  private p1: number = 0;
  private p1N: string;
  private p2N: string;

  constructor(p1N: string, p2N: string) {
    this.p1N = p1N;
    this.p2N = p2N;
  }

  getScore(): string {
    let s: string;
    if (this.p1 < 4 && this.p2 < 4 && !(this.p1 + this.p2 === 6)) {
      const p: string[] = ['Zéro', 'Quinze', 'Trente', 'Quarante'];
      s = p[this.p1];
      return s + '-' + p[this.p2];
    } else {
      if (this.p1 === this.p2)
        return 'Égalité';
      s = this.p1 > this.p2 ? this.p1N : this.p2N;
      return (((this.p1 - this.p2) * (this.p1 - this.p2)) === 1) ? 'Avantage ' + s : 'Jeu ' + s;
    }
  }

  wonPoint(playerName: string): void {
    if (playerName === 'joueur1')
      this.p1 += 1;
    else
      this.p2 += 1;
  }
}
