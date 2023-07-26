import { Component, Input } from '@angular/core';
import { ActivatedRoute, RouterModule } from '@angular/router';

import SharedModule from 'app/shared/shared.module';
import HasAnyAuthorityDirective from 'app/shared/auth/has-any-authority.directive';
import { DurationPipe, FormatMediumDatetimePipe, FormatMediumDatePipe } from 'app/shared/date';
import { IMemberTag } from '../member-tag.model';

@Component({
  standalone: true,
  selector: 'jhi-member-tag-detail',
  templateUrl: './member-tag-detail.component.html',
  imports: [RouterModule, SharedModule, HasAnyAuthorityDirective, DurationPipe, FormatMediumDatetimePipe, FormatMediumDatePipe],
})
export class MemberTagDetailComponent {
  @Input() memberTag: IMemberTag | null = null;

  constructor(protected activatedRoute: ActivatedRoute) {}

  previousState(): void {
    window.history.back();
  }
}
