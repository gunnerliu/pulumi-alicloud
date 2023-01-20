// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cen Transit Router Multicast Domain Associations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.195.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cen.getTransitRouterMulticastDomainAssociations({
 *     ids: ["example_id"],
 *     transitRouterMulticastDomainId: "your_transit_router_multicast_domain_id",
 * });
 * export const cenTransitRouterMulticastDomainId0 = ids.then(ids => ids.associations?.[0]?.id);
 * ```
 */
export function getTransitRouterMulticastDomainAssociations(args: GetTransitRouterMulticastDomainAssociationsArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitRouterMulticastDomainAssociationsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getTransitRouterMulticastDomainAssociations:getTransitRouterMulticastDomainAssociations", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "resourceId": args.resourceId,
        "resourceType": args.resourceType,
        "status": args.status,
        "transitRouterAttachmentId": args.transitRouterAttachmentId,
        "transitRouterMulticastDomainId": args.transitRouterMulticastDomainId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterMulticastDomainAssociations.
 */
export interface GetTransitRouterMulticastDomainAssociationsArgs {
    /**
     * A list of Transit Router Multicast Domain Association IDs.
     */
    ids?: string[];
    outputFile?: string;
    /**
     * The ID of the resource associated with the multicast domain.
     */
    resourceId?: string;
    /**
     * The type of resource associated with the multicast domain. Valid Value: `VPC`.
     */
    resourceType?: string;
    /**
     * The status of the associated resource. Valid Value: `Associated`, `Associating`, `Dissociating`.
     */
    status?: string;
    /**
     * The ID of the network instance connection.
     */
    transitRouterAttachmentId?: string;
    /**
     * The ID of the multicast domain.
     */
    transitRouterMulticastDomainId: string;
    /**
     * The ID of the vSwitch.
     */
    vswitchId?: string;
}

/**
 * A collection of values returned by getTransitRouterMulticastDomainAssociations.
 */
export interface GetTransitRouterMulticastDomainAssociationsResult {
    /**
     * A list of Cen Transit Router Multicast Domain Associations. Each element contains the following attributes:
     */
    readonly associations: outputs.cen.GetTransitRouterMulticastDomainAssociationsAssociation[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * The ID of the resource associated with the multicast domain.
     */
    readonly resourceId?: string;
    /**
     * The type of resource associated with the multicast domain.
     */
    readonly resourceType?: string;
    /**
     * The status of the associated resource.
     */
    readonly status?: string;
    /**
     * The ID of the network instance connection.
     */
    readonly transitRouterAttachmentId?: string;
    /**
     * The ID of the multicast domain.
     */
    readonly transitRouterMulticastDomainId: string;
    /**
     * The ID of the vSwitch.
     */
    readonly vswitchId?: string;
}
/**
 * This data source provides the Cen Transit Router Multicast Domain Associations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.195.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cen.getTransitRouterMulticastDomainAssociations({
 *     ids: ["example_id"],
 *     transitRouterMulticastDomainId: "your_transit_router_multicast_domain_id",
 * });
 * export const cenTransitRouterMulticastDomainId0 = ids.then(ids => ids.associations?.[0]?.id);
 * ```
 */
export function getTransitRouterMulticastDomainAssociationsOutput(args: GetTransitRouterMulticastDomainAssociationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTransitRouterMulticastDomainAssociationsResult> {
    return pulumi.output(args).apply((a: any) => getTransitRouterMulticastDomainAssociations(a, opts))
}

/**
 * A collection of arguments for invoking getTransitRouterMulticastDomainAssociations.
 */
export interface GetTransitRouterMulticastDomainAssociationsOutputArgs {
    /**
     * A list of Transit Router Multicast Domain Association IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the resource associated with the multicast domain.
     */
    resourceId?: pulumi.Input<string>;
    /**
     * The type of resource associated with the multicast domain. Valid Value: `VPC`.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * The status of the associated resource. Valid Value: `Associated`, `Associating`, `Dissociating`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the network instance connection.
     */
    transitRouterAttachmentId?: pulumi.Input<string>;
    /**
     * The ID of the multicast domain.
     */
    transitRouterMulticastDomainId: pulumi.Input<string>;
    /**
     * The ID of the vSwitch.
     */
    vswitchId?: pulumi.Input<string>;
}
