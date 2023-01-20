// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cs/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    public /*out*/ readonly agentVersion!: pulumi.Output<string>;
    public readonly cidrBlock!: pulumi.Output<string>;
    public readonly diskCategory!: pulumi.Output<string | undefined>;
    public readonly diskSize!: pulumi.Output<number | undefined>;
    public readonly imageId!: pulumi.Output<string | undefined>;
    public readonly instanceType!: pulumi.Output<string>;
    public readonly isOutdated!: pulumi.Output<boolean | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly namePrefix!: pulumi.Output<string | undefined>;
    public readonly needSlb!: pulumi.Output<boolean | undefined>;
    public readonly nodeNumber!: pulumi.Output<number | undefined>;
    public /*out*/ readonly nodes!: pulumi.Output<outputs.cs.ClusterNode[]>;
    public readonly password!: pulumi.Output<string>;
    public readonly releaseEip!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly securityGroupId!: pulumi.Output<string>;
    /**
     * @deprecated Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
     */
    public readonly size!: pulumi.Output<number | undefined>;
    public /*out*/ readonly slbId!: pulumi.Output<string>;
    public /*out*/ readonly vpcId!: pulumi.Output<string>;
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["agentVersion"] = state ? state.agentVersion : undefined;
            resourceInputs["cidrBlock"] = state ? state.cidrBlock : undefined;
            resourceInputs["diskCategory"] = state ? state.diskCategory : undefined;
            resourceInputs["diskSize"] = state ? state.diskSize : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["isOutdated"] = state ? state.isOutdated : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["needSlb"] = state ? state.needSlb : undefined;
            resourceInputs["nodeNumber"] = state ? state.nodeNumber : undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["releaseEip"] = state ? state.releaseEip : undefined;
            resourceInputs["securityGroupId"] = state ? state.securityGroupId : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["slbId"] = state ? state.slbId : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.cidrBlock === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidrBlock'");
            }
            if ((!args || args.instanceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceType'");
            }
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["cidrBlock"] = args ? args.cidrBlock : undefined;
            resourceInputs["diskCategory"] = args ? args.diskCategory : undefined;
            resourceInputs["diskSize"] = args ? args.diskSize : undefined;
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["isOutdated"] = args ? args.isOutdated : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["needSlb"] = args ? args.needSlb : undefined;
            resourceInputs["nodeNumber"] = args ? args.nodeNumber : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["releaseEip"] = args ? args.releaseEip : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["agentVersion"] = undefined /*out*/;
            resourceInputs["nodes"] = undefined /*out*/;
            resourceInputs["securityGroupId"] = undefined /*out*/;
            resourceInputs["slbId"] = undefined /*out*/;
            resourceInputs["vpcId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    agentVersion?: pulumi.Input<string>;
    cidrBlock?: pulumi.Input<string>;
    diskCategory?: pulumi.Input<string>;
    diskSize?: pulumi.Input<number>;
    imageId?: pulumi.Input<string>;
    instanceType?: pulumi.Input<string>;
    isOutdated?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    namePrefix?: pulumi.Input<string>;
    needSlb?: pulumi.Input<boolean>;
    nodeNumber?: pulumi.Input<number>;
    nodes?: pulumi.Input<pulumi.Input<inputs.cs.ClusterNode>[]>;
    password?: pulumi.Input<string>;
    releaseEip?: pulumi.Input<boolean>;
    securityGroupId?: pulumi.Input<string>;
    /**
     * @deprecated Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
     */
    size?: pulumi.Input<number>;
    slbId?: pulumi.Input<string>;
    vpcId?: pulumi.Input<string>;
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    cidrBlock: pulumi.Input<string>;
    diskCategory?: pulumi.Input<string>;
    diskSize?: pulumi.Input<number>;
    imageId?: pulumi.Input<string>;
    instanceType: pulumi.Input<string>;
    isOutdated?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    namePrefix?: pulumi.Input<string>;
    needSlb?: pulumi.Input<boolean>;
    nodeNumber?: pulumi.Input<number>;
    password: pulumi.Input<string>;
    releaseEip?: pulumi.Input<boolean>;
    /**
     * @deprecated Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.
     */
    size?: pulumi.Input<number>;
    vswitchId: pulumi.Input<string>;
}
