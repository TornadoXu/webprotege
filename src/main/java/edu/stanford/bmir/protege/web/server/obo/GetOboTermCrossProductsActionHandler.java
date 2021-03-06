package edu.stanford.bmir.protege.web.server.obo;

import edu.stanford.bmir.protege.web.server.access.AccessManager;
import edu.stanford.bmir.protege.web.server.dispatch.AbstractHasProjectActionHandler;
import edu.stanford.bmir.protege.web.server.dispatch.ExecutionContext;
import edu.stanford.bmir.protege.web.shared.obo.GetOboTermCrossProductAction;
import edu.stanford.bmir.protege.web.shared.obo.GetOboTermCrossProductResult;
import edu.stanford.bmir.protege.web.shared.obo.OBOTermCrossProduct;

import javax.annotation.Nonnull;
import javax.inject.Inject;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 23 Jun 2017
 */
public class GetOboTermCrossProductsActionHandler extends AbstractHasProjectActionHandler<GetOboTermCrossProductAction, GetOboTermCrossProductResult> {

    @Nonnull
    private final TermCrossProductsManager crossProductsManager;

    @Inject
    public GetOboTermCrossProductsActionHandler(@Nonnull AccessManager accessManager,
                                                @Nonnull TermCrossProductsManager crossProductsManager) {
        super(accessManager);
        this.crossProductsManager = crossProductsManager;
    }

    @Override
    public Class<GetOboTermCrossProductAction> getActionClass() {
        return GetOboTermCrossProductAction.class;
    }

    @Override
    public GetOboTermCrossProductResult execute(GetOboTermCrossProductAction action,
                                                ExecutionContext executionContext) {
        OBOTermCrossProduct crossProduct = crossProductsManager.getCrossProduct(action.getEntity());
        return new GetOboTermCrossProductResult(crossProduct);
    }
}
