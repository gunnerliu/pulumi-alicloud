// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class Tenant extends pulumi.CustomResource {
    /**
     * Get an existing Tenant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TenantState, opts?: pulumi.CustomResourceOptions): Tenant {
        return new Tenant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ocean/tenant:Tenant';

    /**
     * Returns true if the given object is an instance of Tenant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Tenant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Tenant.__pulumiType;
    }

    public readonly charset!: pulumi.Output<string>;
    public readonly cpu!: pulumi.Output<number>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly instanceId!: pulumi.Output<string>;
    public readonly logDisk!: pulumi.Output<number | undefined>;
    public readonly memory!: pulumi.Output<number>;
    public readonly primaryZone!: pulumi.Output<string>;
    public readonly readOnlyZoneList!: pulumi.Output<string | undefined>;
    public readonly tenantMode!: pulumi.Output<string>;
    public readonly tenantName!: pulumi.Output<string>;
    public readonly timeZone!: pulumi.Output<string>;
    public readonly unitNum!: pulumi.Output<number | undefined>;
    public readonly userVSwitchId!: pulumi.Output<string>;
    public readonly userVpcId!: pulumi.Output<string>;

    /**
     * Create a Tenant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TenantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TenantArgs | TenantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TenantState | undefined;
            resourceInputs["charset"] = state ? state.charset : undefined;
            resourceInputs["cpu"] = state ? state.cpu : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["logDisk"] = state ? state.logDisk : undefined;
            resourceInputs["memory"] = state ? state.memory : undefined;
            resourceInputs["primaryZone"] = state ? state.primaryZone : undefined;
            resourceInputs["readOnlyZoneList"] = state ? state.readOnlyZoneList : undefined;
            resourceInputs["tenantMode"] = state ? state.tenantMode : undefined;
            resourceInputs["tenantName"] = state ? state.tenantName : undefined;
            resourceInputs["timeZone"] = state ? state.timeZone : undefined;
            resourceInputs["unitNum"] = state ? state.unitNum : undefined;
            resourceInputs["userVSwitchId"] = state ? state.userVSwitchId : undefined;
            resourceInputs["userVpcId"] = state ? state.userVpcId : undefined;
        } else {
            const args = argsOrState as TenantArgs | undefined;
            if ((!args || args.charset === undefined) && !opts.urn) {
                throw new Error("Missing required property 'charset'");
            }
            if ((!args || args.cpu === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cpu'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.memory === undefined) && !opts.urn) {
                throw new Error("Missing required property 'memory'");
            }
            if ((!args || args.primaryZone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'primaryZone'");
            }
            if ((!args || args.tenantMode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tenantMode'");
            }
            if ((!args || args.tenantName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tenantName'");
            }
            if ((!args || args.timeZone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeZone'");
            }
            if ((!args || args.userVSwitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userVSwitchId'");
            }
            if ((!args || args.userVpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userVpcId'");
            }
            resourceInputs["charset"] = args ? args.charset : undefined;
            resourceInputs["cpu"] = args ? args.cpu : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["logDisk"] = args ? args.logDisk : undefined;
            resourceInputs["memory"] = args ? args.memory : undefined;
            resourceInputs["primaryZone"] = args ? args.primaryZone : undefined;
            resourceInputs["readOnlyZoneList"] = args ? args.readOnlyZoneList : undefined;
            resourceInputs["tenantMode"] = args ? args.tenantMode : undefined;
            resourceInputs["tenantName"] = args ? args.tenantName : undefined;
            resourceInputs["timeZone"] = args ? args.timeZone : undefined;
            resourceInputs["unitNum"] = args ? args.unitNum : undefined;
            resourceInputs["userVSwitchId"] = args ? args.userVSwitchId : undefined;
            resourceInputs["userVpcId"] = args ? args.userVpcId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Tenant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tenant resources.
 */
export interface TenantState {
    charset?: pulumi.Input<string>;
    cpu?: pulumi.Input<number>;
    description?: pulumi.Input<string>;
    instanceId?: pulumi.Input<string>;
    logDisk?: pulumi.Input<number>;
    memory?: pulumi.Input<number>;
    primaryZone?: pulumi.Input<string>;
    readOnlyZoneList?: pulumi.Input<string>;
    tenantMode?: pulumi.Input<string>;
    tenantName?: pulumi.Input<string>;
    timeZone?: pulumi.Input<string>;
    unitNum?: pulumi.Input<number>;
    userVSwitchId?: pulumi.Input<string>;
    userVpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Tenant resource.
 */
export interface TenantArgs {
    charset: pulumi.Input<string>;
    cpu: pulumi.Input<number>;
    description?: pulumi.Input<string>;
    instanceId: pulumi.Input<string>;
    logDisk?: pulumi.Input<number>;
    memory: pulumi.Input<number>;
    primaryZone: pulumi.Input<string>;
    readOnlyZoneList?: pulumi.Input<string>;
    tenantMode: pulumi.Input<string>;
    tenantName: pulumi.Input<string>;
    timeZone: pulumi.Input<string>;
    unitNum?: pulumi.Input<number>;
    userVSwitchId: pulumi.Input<string>;
    userVpcId: pulumi.Input<string>;
}
