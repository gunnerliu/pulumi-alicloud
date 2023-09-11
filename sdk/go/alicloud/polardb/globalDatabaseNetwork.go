// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package polardb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a PolarDB Global Database Network resource.
//
// For information about PolarDB Global Database Network and how to use it, see [What is Global Database Network](https://www.alibabacloud.com/help/en/polardb-for-mysql/latest/createglobaldatabasenetwork).
//
// > **NOTE:** Available in v1.181.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/polardb"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultNodeClasses, err := polardb.GetNodeClasses(ctx, &polardb.GetNodeClassesArgs{
//				DbType:    pulumi.StringRef("MySQL"),
//				DbVersion: pulumi.StringRef("8.0"),
//				PayType:   "PostPaid",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.16.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
//				VpcId:       defaultNetwork.ID(),
//				CidrBlock:   pulumi.String("172.16.0.0/24"),
//				ZoneId:      *pulumi.String(defaultNodeClasses.Classes[0].ZoneId),
//				VswitchName: pulumi.String("terraform-example"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultCluster, err := polardb.NewCluster(ctx, "defaultCluster", &polardb.ClusterArgs{
//				DbType:      pulumi.String("MySQL"),
//				DbVersion:   pulumi.String("8.0"),
//				DbNodeClass: *pulumi.String(defaultNodeClasses.Classes[0].SupportedEngines[0].AvailableResources[0].DbNodeClass),
//				PayType:     pulumi.String("PostPaid"),
//				VswitchId:   defaultSwitch.ID(),
//				Description: pulumi.String("terraform-example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = polardb.NewGlobalDatabaseNetwork(ctx, "defaultGlobalDatabaseNetwork", &polardb.GlobalDatabaseNetworkArgs{
//				DbClusterId: defaultCluster.ID(),
//				Description: pulumi.String("terraform-example"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// PolarDB Global Database Network can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:polardb/globalDatabaseNetwork:GlobalDatabaseNetwork example <id>
//
// ```
type GlobalDatabaseNetwork struct {
	pulumi.CustomResourceState

	// The ID of the primary cluster.
	DbClusterId pulumi.StringOutput `pulumi:"dbClusterId"`
	// The description of the Global Database Network.
	Description pulumi.StringOutput `pulumi:"description"`
	// The status of the Global Database Network.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewGlobalDatabaseNetwork registers a new resource with the given unique name, arguments, and options.
func NewGlobalDatabaseNetwork(ctx *pulumi.Context,
	name string, args *GlobalDatabaseNetworkArgs, opts ...pulumi.ResourceOption) (*GlobalDatabaseNetwork, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DbClusterId == nil {
		return nil, errors.New("invalid value for required argument 'DbClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GlobalDatabaseNetwork
	err := ctx.RegisterResource("alicloud:polardb/globalDatabaseNetwork:GlobalDatabaseNetwork", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalDatabaseNetwork gets an existing GlobalDatabaseNetwork resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalDatabaseNetwork(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalDatabaseNetworkState, opts ...pulumi.ResourceOption) (*GlobalDatabaseNetwork, error) {
	var resource GlobalDatabaseNetwork
	err := ctx.ReadResource("alicloud:polardb/globalDatabaseNetwork:GlobalDatabaseNetwork", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalDatabaseNetwork resources.
type globalDatabaseNetworkState struct {
	// The ID of the primary cluster.
	DbClusterId *string `pulumi:"dbClusterId"`
	// The description of the Global Database Network.
	Description *string `pulumi:"description"`
	// The status of the Global Database Network.
	Status *string `pulumi:"status"`
}

type GlobalDatabaseNetworkState struct {
	// The ID of the primary cluster.
	DbClusterId pulumi.StringPtrInput
	// The description of the Global Database Network.
	Description pulumi.StringPtrInput
	// The status of the Global Database Network.
	Status pulumi.StringPtrInput
}

func (GlobalDatabaseNetworkState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDatabaseNetworkState)(nil)).Elem()
}

type globalDatabaseNetworkArgs struct {
	// The ID of the primary cluster.
	DbClusterId string `pulumi:"dbClusterId"`
	// The description of the Global Database Network.
	Description *string `pulumi:"description"`
}

// The set of arguments for constructing a GlobalDatabaseNetwork resource.
type GlobalDatabaseNetworkArgs struct {
	// The ID of the primary cluster.
	DbClusterId pulumi.StringInput
	// The description of the Global Database Network.
	Description pulumi.StringPtrInput
}

func (GlobalDatabaseNetworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalDatabaseNetworkArgs)(nil)).Elem()
}

type GlobalDatabaseNetworkInput interface {
	pulumi.Input

	ToGlobalDatabaseNetworkOutput() GlobalDatabaseNetworkOutput
	ToGlobalDatabaseNetworkOutputWithContext(ctx context.Context) GlobalDatabaseNetworkOutput
}

func (*GlobalDatabaseNetwork) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalDatabaseNetwork)(nil)).Elem()
}

func (i *GlobalDatabaseNetwork) ToGlobalDatabaseNetworkOutput() GlobalDatabaseNetworkOutput {
	return i.ToGlobalDatabaseNetworkOutputWithContext(context.Background())
}

func (i *GlobalDatabaseNetwork) ToGlobalDatabaseNetworkOutputWithContext(ctx context.Context) GlobalDatabaseNetworkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDatabaseNetworkOutput)
}

func (i *GlobalDatabaseNetwork) ToOutput(ctx context.Context) pulumix.Output[*GlobalDatabaseNetwork] {
	return pulumix.Output[*GlobalDatabaseNetwork]{
		OutputState: i.ToGlobalDatabaseNetworkOutputWithContext(ctx).OutputState,
	}
}

// GlobalDatabaseNetworkArrayInput is an input type that accepts GlobalDatabaseNetworkArray and GlobalDatabaseNetworkArrayOutput values.
// You can construct a concrete instance of `GlobalDatabaseNetworkArrayInput` via:
//
//	GlobalDatabaseNetworkArray{ GlobalDatabaseNetworkArgs{...} }
type GlobalDatabaseNetworkArrayInput interface {
	pulumi.Input

	ToGlobalDatabaseNetworkArrayOutput() GlobalDatabaseNetworkArrayOutput
	ToGlobalDatabaseNetworkArrayOutputWithContext(context.Context) GlobalDatabaseNetworkArrayOutput
}

type GlobalDatabaseNetworkArray []GlobalDatabaseNetworkInput

func (GlobalDatabaseNetworkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalDatabaseNetwork)(nil)).Elem()
}

func (i GlobalDatabaseNetworkArray) ToGlobalDatabaseNetworkArrayOutput() GlobalDatabaseNetworkArrayOutput {
	return i.ToGlobalDatabaseNetworkArrayOutputWithContext(context.Background())
}

func (i GlobalDatabaseNetworkArray) ToGlobalDatabaseNetworkArrayOutputWithContext(ctx context.Context) GlobalDatabaseNetworkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDatabaseNetworkArrayOutput)
}

func (i GlobalDatabaseNetworkArray) ToOutput(ctx context.Context) pulumix.Output[[]*GlobalDatabaseNetwork] {
	return pulumix.Output[[]*GlobalDatabaseNetwork]{
		OutputState: i.ToGlobalDatabaseNetworkArrayOutputWithContext(ctx).OutputState,
	}
}

// GlobalDatabaseNetworkMapInput is an input type that accepts GlobalDatabaseNetworkMap and GlobalDatabaseNetworkMapOutput values.
// You can construct a concrete instance of `GlobalDatabaseNetworkMapInput` via:
//
//	GlobalDatabaseNetworkMap{ "key": GlobalDatabaseNetworkArgs{...} }
type GlobalDatabaseNetworkMapInput interface {
	pulumi.Input

	ToGlobalDatabaseNetworkMapOutput() GlobalDatabaseNetworkMapOutput
	ToGlobalDatabaseNetworkMapOutputWithContext(context.Context) GlobalDatabaseNetworkMapOutput
}

type GlobalDatabaseNetworkMap map[string]GlobalDatabaseNetworkInput

func (GlobalDatabaseNetworkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalDatabaseNetwork)(nil)).Elem()
}

func (i GlobalDatabaseNetworkMap) ToGlobalDatabaseNetworkMapOutput() GlobalDatabaseNetworkMapOutput {
	return i.ToGlobalDatabaseNetworkMapOutputWithContext(context.Background())
}

func (i GlobalDatabaseNetworkMap) ToGlobalDatabaseNetworkMapOutputWithContext(ctx context.Context) GlobalDatabaseNetworkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalDatabaseNetworkMapOutput)
}

func (i GlobalDatabaseNetworkMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*GlobalDatabaseNetwork] {
	return pulumix.Output[map[string]*GlobalDatabaseNetwork]{
		OutputState: i.ToGlobalDatabaseNetworkMapOutputWithContext(ctx).OutputState,
	}
}

type GlobalDatabaseNetworkOutput struct{ *pulumi.OutputState }

func (GlobalDatabaseNetworkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalDatabaseNetwork)(nil)).Elem()
}

func (o GlobalDatabaseNetworkOutput) ToGlobalDatabaseNetworkOutput() GlobalDatabaseNetworkOutput {
	return o
}

func (o GlobalDatabaseNetworkOutput) ToGlobalDatabaseNetworkOutputWithContext(ctx context.Context) GlobalDatabaseNetworkOutput {
	return o
}

func (o GlobalDatabaseNetworkOutput) ToOutput(ctx context.Context) pulumix.Output[*GlobalDatabaseNetwork] {
	return pulumix.Output[*GlobalDatabaseNetwork]{
		OutputState: o.OutputState,
	}
}

// The ID of the primary cluster.
func (o GlobalDatabaseNetworkOutput) DbClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDatabaseNetwork) pulumi.StringOutput { return v.DbClusterId }).(pulumi.StringOutput)
}

// The description of the Global Database Network.
func (o GlobalDatabaseNetworkOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDatabaseNetwork) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The status of the Global Database Network.
func (o GlobalDatabaseNetworkOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalDatabaseNetwork) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type GlobalDatabaseNetworkArrayOutput struct{ *pulumi.OutputState }

func (GlobalDatabaseNetworkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalDatabaseNetwork)(nil)).Elem()
}

func (o GlobalDatabaseNetworkArrayOutput) ToGlobalDatabaseNetworkArrayOutput() GlobalDatabaseNetworkArrayOutput {
	return o
}

func (o GlobalDatabaseNetworkArrayOutput) ToGlobalDatabaseNetworkArrayOutputWithContext(ctx context.Context) GlobalDatabaseNetworkArrayOutput {
	return o
}

func (o GlobalDatabaseNetworkArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*GlobalDatabaseNetwork] {
	return pulumix.Output[[]*GlobalDatabaseNetwork]{
		OutputState: o.OutputState,
	}
}

func (o GlobalDatabaseNetworkArrayOutput) Index(i pulumi.IntInput) GlobalDatabaseNetworkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalDatabaseNetwork {
		return vs[0].([]*GlobalDatabaseNetwork)[vs[1].(int)]
	}).(GlobalDatabaseNetworkOutput)
}

type GlobalDatabaseNetworkMapOutput struct{ *pulumi.OutputState }

func (GlobalDatabaseNetworkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalDatabaseNetwork)(nil)).Elem()
}

func (o GlobalDatabaseNetworkMapOutput) ToGlobalDatabaseNetworkMapOutput() GlobalDatabaseNetworkMapOutput {
	return o
}

func (o GlobalDatabaseNetworkMapOutput) ToGlobalDatabaseNetworkMapOutputWithContext(ctx context.Context) GlobalDatabaseNetworkMapOutput {
	return o
}

func (o GlobalDatabaseNetworkMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*GlobalDatabaseNetwork] {
	return pulumix.Output[map[string]*GlobalDatabaseNetwork]{
		OutputState: o.OutputState,
	}
}

func (o GlobalDatabaseNetworkMapOutput) MapIndex(k pulumi.StringInput) GlobalDatabaseNetworkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalDatabaseNetwork {
		return vs[0].(map[string]*GlobalDatabaseNetwork)[vs[1].(string)]
	}).(GlobalDatabaseNetworkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDatabaseNetworkInput)(nil)).Elem(), &GlobalDatabaseNetwork{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDatabaseNetworkArrayInput)(nil)).Elem(), GlobalDatabaseNetworkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalDatabaseNetworkMapInput)(nil)).Elem(), GlobalDatabaseNetworkMap{})
	pulumi.RegisterOutputType(GlobalDatabaseNetworkOutput{})
	pulumi.RegisterOutputType(GlobalDatabaseNetworkArrayOutput{})
	pulumi.RegisterOutputType(GlobalDatabaseNetworkMapOutput{})
}
