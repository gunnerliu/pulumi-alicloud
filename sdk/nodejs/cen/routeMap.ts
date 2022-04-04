// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This topic provides an overview of the route map function of Cloud Enterprise Networks (CENs).
 * You can use the route map function to filter routes and modify route attributes.
 * By doing so, you can manage the communication between networks attached to a CEN.
 *
 * For information about CEN Route Map and how to use it, see [Manage CEN Route Map](https://www.alibabacloud.com/help/doc-detail/124157.htm).
 *
 * > **NOTE:** Available in 1.82.0+
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Create a cen Route map resource and use it.
 * const defaultInstance = new alicloud.cen.Instance("defaultInstance", {});
 * const vpc00Region = new alicloud.Provider("vpc00Region", {region: "cn-hangzhou"});
 * const vpc01Region = new alicloud.Provider("vpc01Region", {region: "cn-shanghai"});
 * const vpc00 = new alicloud.vpc.Network("vpc00", {cidrBlock: "172.16.0.0/12"}, {
 *     provider: alicloud.vpc00_region,
 * });
 * const vpc01 = new alicloud.vpc.Network("vpc01", {cidrBlock: "172.16.0.0/12"}, {
 *     provider: alicloud.vpc01_region,
 * });
 * const default00 = new alicloud.cen.InstanceAttachment("default00", {
 *     instanceId: defaultInstance.id,
 *     childInstanceId: vpc00.id,
 *     childInstanceType: "VPC",
 *     childInstanceRegionId: "cn-hangzhou",
 * });
 * const default01 = new alicloud.cen.InstanceAttachment("default01", {
 *     instanceId: defaultInstance.id,
 *     childInstanceId: vpc01.id,
 *     childInstanceType: "VPC",
 *     childInstanceRegionId: "cn-shanghai",
 * });
 * const defaultRouteMap = new alicloud.cen.RouteMap("defaultRouteMap", {
 *     cenRegionId: "cn-hangzhou",
 *     cenId: alicloud_cen_instance.cen.id,
 *     description: "test-desc",
 *     priority: 1,
 *     transmitDirection: "RegionIn",
 *     mapResult: "Permit",
 *     nextPriority: 1,
 *     sourceRegionIds: ["cn-hangzhou"],
 *     sourceInstanceIds: [vpc00.id],
 *     sourceInstanceIdsReverseMatch: false,
 *     destinationInstanceIds: [vpc01.id],
 *     destinationInstanceIdsReverseMatch: false,
 *     sourceRouteTableIds: [vpc00.routeTableId],
 *     destinationRouteTableIds: [vpc01.routeTableId],
 *     sourceChildInstanceTypes: ["VPC"],
 *     destinationChildInstanceTypes: ["VPC"],
 *     destinationCidrBlocks: [vpc01.cidrBlock],
 *     cidrMatchMode: "Include",
 *     routeTypes: ["System"],
 *     matchAsns: ["65501"],
 *     asPathMatchMode: "Include",
 *     matchCommunitySets: ["65501:1"],
 *     communityMatchMode: "Include",
 *     communityOperateMode: "Additive",
 *     operateCommunitySets: ["65501:1"],
 *     preference: 20,
 *     prependAsPaths: ["65501"],
 * }, {
 *     dependsOn: [
 *         default00,
 *         default01,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * CEN RouteMap can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/routeMap:RouteMap default <cen_id>:<route_map_id>.
 * ```
 */
export class RouteMap extends pulumi.CustomResource {
    /**
     * Get an existing RouteMap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteMapState, opts?: pulumi.CustomResourceOptions): RouteMap {
        return new RouteMap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/routeMap:RouteMap';

    /**
     * Returns true if the given object is an instance of RouteMap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RouteMap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RouteMap.__pulumiType;
    }

    /**
     * A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: ["Include", "Complete"].
     */
    public readonly asPathMatchMode!: pulumi.Output<string | undefined>;
    /**
     * The ID of the CEN instance.
     */
    public readonly cenId!: pulumi.Output<string>;
    /**
     * The ID of the region to which the CEN instance belongs.
     */
    public readonly cenRegionId!: pulumi.Output<string>;
    /**
     * A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: ["Include", "Complete"].
     */
    public readonly cidrMatchMode!: pulumi.Output<string | undefined>;
    /**
     * A match statement. It indicates the mode in which the community attribute is matched. Valid values: ["Include", "Complete"].
     */
    public readonly communityMatchMode!: pulumi.Output<string | undefined>;
    /**
     * An action statement. It indicates the mode in which the community attribute is operated. Valid values: ["Additive", "Replace"].
     */
    public readonly communityOperateMode!: pulumi.Output<string | undefined>;
    /**
     * The description of the route map.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A match statement that indicates the list of destination instance types. Valid values: ["VPC", "VBR", "CCN"].
     */
    public readonly destinationChildInstanceTypes!: pulumi.Output<string[] | undefined>;
    /**
     * A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
     */
    public readonly destinationCidrBlocks!: pulumi.Output<string[] | undefined>;
    /**
     * A match statement that indicates the list of IDs of the destination instances.
     */
    public readonly destinationInstanceIds!: pulumi.Output<string[] | undefined>;
    /**
     * Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
     */
    public readonly destinationInstanceIdsReverseMatch!: pulumi.Output<boolean | undefined>;
    /**
     * A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
     */
    public readonly destinationRouteTableIds!: pulumi.Output<string[] | undefined>;
    /**
     * The action that is performed to a route if the route matches all the match conditions. Valid values: ["Permit", "Deny"].
     */
    public readonly mapResult!: pulumi.Output<string>;
    /**
     * A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
     */
    public readonly matchAsns!: pulumi.Output<string[] | undefined>;
    /**
     * A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     */
    public readonly matchCommunitySets!: pulumi.Output<string[] | undefined>;
    /**
     * The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
     */
    public readonly nextPriority!: pulumi.Output<number | undefined>;
    /**
     * An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     */
    public readonly operateCommunitySets!: pulumi.Output<string[] | undefined>;
    /**
     * An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
     */
    public readonly preference!: pulumi.Output<number | undefined>;
    /**
     * An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
     */
    public readonly prependAsPaths!: pulumi.Output<string[] | undefined>;
    /**
     * The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * ID of the RouteMap. It is available in 1.161.0+.
     */
    public /*out*/ readonly routeMapId!: pulumi.Output<string>;
    /**
     * A match statement that indicates the list of route types. Valid values: ["System", "Custom", "BGP"].
     */
    public readonly routeTypes!: pulumi.Output<string[] | undefined>;
    /**
     * A match statement that indicates the list of source instance types. Valid values: ["VPC", "VBR", "CCN"].
     */
    public readonly sourceChildInstanceTypes!: pulumi.Output<string[] | undefined>;
    /**
     * A match statement that indicates the list of IDs of the source instances.
     */
    public readonly sourceInstanceIds!: pulumi.Output<string[] | undefined>;
    /**
     * Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
     */
    public readonly sourceInstanceIdsReverseMatch!: pulumi.Output<boolean | undefined>;
    /**
     * A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
     */
    public readonly sourceRegionIds!: pulumi.Output<string[] | undefined>;
    /**
     * A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
     */
    public readonly sourceRouteTableIds!: pulumi.Output<string[] | undefined>;
    /**
     * (Computed) The status of route map. Valid values: ["Creating", "Active", "Deleting"].
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The direction in which the route map is applied. Valid values: ["RegionIn", "RegionOut"].
     */
    public readonly transmitDirection!: pulumi.Output<string>;

    /**
     * Create a RouteMap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteMapArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteMapArgs | RouteMapState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouteMapState | undefined;
            resourceInputs["asPathMatchMode"] = state ? state.asPathMatchMode : undefined;
            resourceInputs["cenId"] = state ? state.cenId : undefined;
            resourceInputs["cenRegionId"] = state ? state.cenRegionId : undefined;
            resourceInputs["cidrMatchMode"] = state ? state.cidrMatchMode : undefined;
            resourceInputs["communityMatchMode"] = state ? state.communityMatchMode : undefined;
            resourceInputs["communityOperateMode"] = state ? state.communityOperateMode : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destinationChildInstanceTypes"] = state ? state.destinationChildInstanceTypes : undefined;
            resourceInputs["destinationCidrBlocks"] = state ? state.destinationCidrBlocks : undefined;
            resourceInputs["destinationInstanceIds"] = state ? state.destinationInstanceIds : undefined;
            resourceInputs["destinationInstanceIdsReverseMatch"] = state ? state.destinationInstanceIdsReverseMatch : undefined;
            resourceInputs["destinationRouteTableIds"] = state ? state.destinationRouteTableIds : undefined;
            resourceInputs["mapResult"] = state ? state.mapResult : undefined;
            resourceInputs["matchAsns"] = state ? state.matchAsns : undefined;
            resourceInputs["matchCommunitySets"] = state ? state.matchCommunitySets : undefined;
            resourceInputs["nextPriority"] = state ? state.nextPriority : undefined;
            resourceInputs["operateCommunitySets"] = state ? state.operateCommunitySets : undefined;
            resourceInputs["preference"] = state ? state.preference : undefined;
            resourceInputs["prependAsPaths"] = state ? state.prependAsPaths : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["routeMapId"] = state ? state.routeMapId : undefined;
            resourceInputs["routeTypes"] = state ? state.routeTypes : undefined;
            resourceInputs["sourceChildInstanceTypes"] = state ? state.sourceChildInstanceTypes : undefined;
            resourceInputs["sourceInstanceIds"] = state ? state.sourceInstanceIds : undefined;
            resourceInputs["sourceInstanceIdsReverseMatch"] = state ? state.sourceInstanceIdsReverseMatch : undefined;
            resourceInputs["sourceRegionIds"] = state ? state.sourceRegionIds : undefined;
            resourceInputs["sourceRouteTableIds"] = state ? state.sourceRouteTableIds : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["transmitDirection"] = state ? state.transmitDirection : undefined;
        } else {
            const args = argsOrState as RouteMapArgs | undefined;
            if ((!args || args.cenId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenId'");
            }
            if ((!args || args.cenRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenRegionId'");
            }
            if ((!args || args.mapResult === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mapResult'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            if ((!args || args.transmitDirection === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transmitDirection'");
            }
            resourceInputs["asPathMatchMode"] = args ? args.asPathMatchMode : undefined;
            resourceInputs["cenId"] = args ? args.cenId : undefined;
            resourceInputs["cenRegionId"] = args ? args.cenRegionId : undefined;
            resourceInputs["cidrMatchMode"] = args ? args.cidrMatchMode : undefined;
            resourceInputs["communityMatchMode"] = args ? args.communityMatchMode : undefined;
            resourceInputs["communityOperateMode"] = args ? args.communityOperateMode : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destinationChildInstanceTypes"] = args ? args.destinationChildInstanceTypes : undefined;
            resourceInputs["destinationCidrBlocks"] = args ? args.destinationCidrBlocks : undefined;
            resourceInputs["destinationInstanceIds"] = args ? args.destinationInstanceIds : undefined;
            resourceInputs["destinationInstanceIdsReverseMatch"] = args ? args.destinationInstanceIdsReverseMatch : undefined;
            resourceInputs["destinationRouteTableIds"] = args ? args.destinationRouteTableIds : undefined;
            resourceInputs["mapResult"] = args ? args.mapResult : undefined;
            resourceInputs["matchAsns"] = args ? args.matchAsns : undefined;
            resourceInputs["matchCommunitySets"] = args ? args.matchCommunitySets : undefined;
            resourceInputs["nextPriority"] = args ? args.nextPriority : undefined;
            resourceInputs["operateCommunitySets"] = args ? args.operateCommunitySets : undefined;
            resourceInputs["preference"] = args ? args.preference : undefined;
            resourceInputs["prependAsPaths"] = args ? args.prependAsPaths : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["routeTypes"] = args ? args.routeTypes : undefined;
            resourceInputs["sourceChildInstanceTypes"] = args ? args.sourceChildInstanceTypes : undefined;
            resourceInputs["sourceInstanceIds"] = args ? args.sourceInstanceIds : undefined;
            resourceInputs["sourceInstanceIdsReverseMatch"] = args ? args.sourceInstanceIdsReverseMatch : undefined;
            resourceInputs["sourceRegionIds"] = args ? args.sourceRegionIds : undefined;
            resourceInputs["sourceRouteTableIds"] = args ? args.sourceRouteTableIds : undefined;
            resourceInputs["transmitDirection"] = args ? args.transmitDirection : undefined;
            resourceInputs["routeMapId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RouteMap.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RouteMap resources.
 */
export interface RouteMapState {
    /**
     * A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: ["Include", "Complete"].
     */
    asPathMatchMode?: pulumi.Input<string>;
    /**
     * The ID of the CEN instance.
     */
    cenId?: pulumi.Input<string>;
    /**
     * The ID of the region to which the CEN instance belongs.
     */
    cenRegionId?: pulumi.Input<string>;
    /**
     * A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: ["Include", "Complete"].
     */
    cidrMatchMode?: pulumi.Input<string>;
    /**
     * A match statement. It indicates the mode in which the community attribute is matched. Valid values: ["Include", "Complete"].
     */
    communityMatchMode?: pulumi.Input<string>;
    /**
     * An action statement. It indicates the mode in which the community attribute is operated. Valid values: ["Additive", "Replace"].
     */
    communityOperateMode?: pulumi.Input<string>;
    /**
     * The description of the route map.
     */
    description?: pulumi.Input<string>;
    /**
     * A match statement that indicates the list of destination instance types. Valid values: ["VPC", "VBR", "CCN"].
     */
    destinationChildInstanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
     */
    destinationCidrBlocks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the list of IDs of the destination instances.
     */
    destinationInstanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
     */
    destinationInstanceIdsReverseMatch?: pulumi.Input<boolean>;
    /**
     * A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
     */
    destinationRouteTableIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The action that is performed to a route if the route matches all the match conditions. Valid values: ["Permit", "Deny"].
     */
    mapResult?: pulumi.Input<string>;
    /**
     * A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
     */
    matchAsns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     */
    matchCommunitySets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
     */
    nextPriority?: pulumi.Input<number>;
    /**
     * An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     */
    operateCommunitySets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
     */
    preference?: pulumi.Input<number>;
    /**
     * An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
     */
    prependAsPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
     */
    priority?: pulumi.Input<number>;
    /**
     * ID of the RouteMap. It is available in 1.161.0+.
     */
    routeMapId?: pulumi.Input<string>;
    /**
     * A match statement that indicates the list of route types. Valid values: ["System", "Custom", "BGP"].
     */
    routeTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the list of source instance types. Valid values: ["VPC", "VBR", "CCN"].
     */
    sourceChildInstanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the list of IDs of the source instances.
     */
    sourceInstanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
     */
    sourceInstanceIdsReverseMatch?: pulumi.Input<boolean>;
    /**
     * A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
     */
    sourceRegionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
     */
    sourceRouteTableIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Computed) The status of route map. Valid values: ["Creating", "Active", "Deleting"].
     */
    status?: pulumi.Input<string>;
    /**
     * The direction in which the route map is applied. Valid values: ["RegionIn", "RegionOut"].
     */
    transmitDirection?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RouteMap resource.
 */
export interface RouteMapArgs {
    /**
     * A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: ["Include", "Complete"].
     */
    asPathMatchMode?: pulumi.Input<string>;
    /**
     * The ID of the CEN instance.
     */
    cenId: pulumi.Input<string>;
    /**
     * The ID of the region to which the CEN instance belongs.
     */
    cenRegionId: pulumi.Input<string>;
    /**
     * A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: ["Include", "Complete"].
     */
    cidrMatchMode?: pulumi.Input<string>;
    /**
     * A match statement. It indicates the mode in which the community attribute is matched. Valid values: ["Include", "Complete"].
     */
    communityMatchMode?: pulumi.Input<string>;
    /**
     * An action statement. It indicates the mode in which the community attribute is operated. Valid values: ["Additive", "Replace"].
     */
    communityOperateMode?: pulumi.Input<string>;
    /**
     * The description of the route map.
     */
    description?: pulumi.Input<string>;
    /**
     * A match statement that indicates the list of destination instance types. Valid values: ["VPC", "VBR", "CCN"].
     */
    destinationChildInstanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
     */
    destinationCidrBlocks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the list of IDs of the destination instances.
     */
    destinationInstanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
     */
    destinationInstanceIdsReverseMatch?: pulumi.Input<boolean>;
    /**
     * A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
     */
    destinationRouteTableIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The action that is performed to a route if the route matches all the match conditions. Valid values: ["Permit", "Deny"].
     */
    mapResult: pulumi.Input<string>;
    /**
     * A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
     */
    matchAsns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     */
    matchCommunitySets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
     */
    nextPriority?: pulumi.Input<number>;
    /**
     * An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
     */
    operateCommunitySets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
     */
    preference?: pulumi.Input<number>;
    /**
     * An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
     */
    prependAsPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
     */
    priority: pulumi.Input<number>;
    /**
     * A match statement that indicates the list of route types. Valid values: ["System", "Custom", "BGP"].
     */
    routeTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the list of source instance types. Valid values: ["VPC", "VBR", "CCN"].
     */
    sourceChildInstanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the list of IDs of the source instances.
     */
    sourceInstanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
     */
    sourceInstanceIdsReverseMatch?: pulumi.Input<boolean>;
    /**
     * A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
     */
    sourceRegionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
     */
    sourceRouteTableIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The direction in which the route map is applied. Valid values: ["RegionIn", "RegionOut"].
     */
    transmitDirection: pulumi.Input<string>;
}
