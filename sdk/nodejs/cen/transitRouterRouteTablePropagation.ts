// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a CEN transit router route table propagation resource.[What is Cen Transit Router Route Table Propagation](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-enabletransitrouterroutetablepropagation)
 *
 * > **NOTE:** Available since v1.126.0.
 *
 * ## Import
 *
 * CEN transit router route table propagation can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterRouteTablePropagation:TransitRouterRouteTablePropagation default tr-********:tr-attach-********
 * ```
 */
export class TransitRouterRouteTablePropagation extends pulumi.CustomResource {
    /**
     * Get an existing TransitRouterRouteTablePropagation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TransitRouterRouteTablePropagationState, opts?: pulumi.CustomResourceOptions): TransitRouterRouteTablePropagation {
        return new TransitRouterRouteTablePropagation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/transitRouterRouteTablePropagation:TransitRouterRouteTablePropagation';

    /**
     * Returns true if the given object is an instance of TransitRouterRouteTablePropagation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TransitRouterRouteTablePropagation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TransitRouterRouteTablePropagation.__pulumiType;
    }

    /**
     * The dry run.
     *
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The associating status of the network.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The ID the transit router attachment.
     */
    public readonly transitRouterAttachmentId!: pulumi.Output<string>;
    /**
     * The ID of the transit router route table.
     */
    public readonly transitRouterRouteTableId!: pulumi.Output<string>;

    /**
     * Create a TransitRouterRouteTablePropagation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TransitRouterRouteTablePropagationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TransitRouterRouteTablePropagationArgs | TransitRouterRouteTablePropagationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TransitRouterRouteTablePropagationState | undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["transitRouterAttachmentId"] = state ? state.transitRouterAttachmentId : undefined;
            resourceInputs["transitRouterRouteTableId"] = state ? state.transitRouterRouteTableId : undefined;
        } else {
            const args = argsOrState as TransitRouterRouteTablePropagationArgs | undefined;
            if ((!args || args.transitRouterAttachmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterAttachmentId'");
            }
            if ((!args || args.transitRouterRouteTableId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterRouteTableId'");
            }
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["transitRouterAttachmentId"] = args ? args.transitRouterAttachmentId : undefined;
            resourceInputs["transitRouterRouteTableId"] = args ? args.transitRouterRouteTableId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TransitRouterRouteTablePropagation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TransitRouterRouteTablePropagation resources.
 */
export interface TransitRouterRouteTablePropagationState {
    /**
     * The dry run.
     *
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The associating status of the network.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID the transit router attachment.
     */
    transitRouterAttachmentId?: pulumi.Input<string>;
    /**
     * The ID of the transit router route table.
     */
    transitRouterRouteTableId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TransitRouterRouteTablePropagation resource.
 */
export interface TransitRouterRouteTablePropagationArgs {
    /**
     * The dry run.
     *
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The ID the transit router attachment.
     */
    transitRouterAttachmentId: pulumi.Input<string>;
    /**
     * The ID of the transit router route table.
     */
    transitRouterRouteTableId: pulumi.Input<string>;
}
