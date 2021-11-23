// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudstoragegateway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Storage Gateway Gateway Logging resource.
//
// For information about Cloud Storage Gateway Gateway Logging and how to use it, see [What is Gateway Logging](https://www.alibabacloud.com/help/en/doc-detail/108299.htm).
//
// > **NOTE:** Available in v1.144.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudstoragegateway"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/log"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "example"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String(name),
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		opt0 := "VSwitch"
// 		defaultZones, err := alicloud.GetZones(ctx, &GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:       defaultNetwork.ID(),
// 			CidrBlock:   pulumi.String("172.16.0.0/21"),
// 			ZoneId:      pulumi.String(defaultZones.Zones[0].Id),
// 			VswitchName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultStorageBundle, err := cloudstoragegateway.NewStorageBundle(ctx, "defaultStorageBundle", &cloudstoragegateway.StorageBundleArgs{
// 			StorageBundleName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultGateway, err := cloudstoragegateway.NewGateway(ctx, "defaultGateway", &cloudstoragegateway.GatewayArgs{
// 			Description:            pulumi.String("tf-acctestDesalone"),
// 			GatewayClass:           pulumi.String("Basic"),
// 			Type:                   pulumi.String("File"),
// 			PaymentType:            pulumi.String("PayAsYouGo"),
// 			VswitchId:              defaultSwitch.ID(),
// 			ReleaseAfterExpiration: pulumi.Bool(true),
// 			PublicNetworkBandwidth: pulumi.Int(10),
// 			StorageBundleId:        defaultStorageBundle.ID(),
// 			Location:               pulumi.String("Cloud"),
// 			GatewayName:            pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultProject, err := log.NewProject(ctx, "defaultProject", &log.ProjectArgs{
// 			Description: pulumi.String("created by terraform"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultStore, err := log.NewStore(ctx, "defaultStore", &log.StoreArgs{
// 			Project:            defaultProject.Name,
// 			ShardCount:         pulumi.Int(3),
// 			AutoSplit:          pulumi.Bool(true),
// 			MaxSplitShardCount: pulumi.Int(60),
// 			AppendMeta:         pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudstoragegateway.NewGatewayLogging(ctx, "defaultGatewayLogging", &cloudstoragegateway.GatewayLoggingArgs{
// 			GatewayId:   defaultGateway.ID(),
// 			SlsLogstore: defaultStore.Name,
// 			SlsProject:  defaultProject.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Cloud Storage Gateway Gateway Logging can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging example <gateway_id>
// ```
type GatewayLogging struct {
	pulumi.CustomResourceState

	// The ID of the Gateway.
	GatewayId pulumi.StringOutput `pulumi:"gatewayId"`
	// The name of the Log Store.
	SlsLogstore pulumi.StringOutput `pulumi:"slsLogstore"`
	// The name of the Project.
	SlsProject pulumi.StringOutput `pulumi:"slsProject"`
	// The status of the resource. Valid values: `Enabled`, `Disable`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewGatewayLogging registers a new resource with the given unique name, arguments, and options.
func NewGatewayLogging(ctx *pulumi.Context,
	name string, args *GatewayLoggingArgs, opts ...pulumi.ResourceOption) (*GatewayLogging, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GatewayId == nil {
		return nil, errors.New("invalid value for required argument 'GatewayId'")
	}
	if args.SlsLogstore == nil {
		return nil, errors.New("invalid value for required argument 'SlsLogstore'")
	}
	if args.SlsProject == nil {
		return nil, errors.New("invalid value for required argument 'SlsProject'")
	}
	var resource GatewayLogging
	err := ctx.RegisterResource("alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewayLogging gets an existing GatewayLogging resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewayLogging(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayLoggingState, opts ...pulumi.ResourceOption) (*GatewayLogging, error) {
	var resource GatewayLogging
	err := ctx.ReadResource("alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GatewayLogging resources.
type gatewayLoggingState struct {
	// The ID of the Gateway.
	GatewayId *string `pulumi:"gatewayId"`
	// The name of the Log Store.
	SlsLogstore *string `pulumi:"slsLogstore"`
	// The name of the Project.
	SlsProject *string `pulumi:"slsProject"`
	// The status of the resource. Valid values: `Enabled`, `Disable`.
	Status *string `pulumi:"status"`
}

type GatewayLoggingState struct {
	// The ID of the Gateway.
	GatewayId pulumi.StringPtrInput
	// The name of the Log Store.
	SlsLogstore pulumi.StringPtrInput
	// The name of the Project.
	SlsProject pulumi.StringPtrInput
	// The status of the resource. Valid values: `Enabled`, `Disable`.
	Status pulumi.StringPtrInput
}

func (GatewayLoggingState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayLoggingState)(nil)).Elem()
}

type gatewayLoggingArgs struct {
	// The ID of the Gateway.
	GatewayId string `pulumi:"gatewayId"`
	// The name of the Log Store.
	SlsLogstore string `pulumi:"slsLogstore"`
	// The name of the Project.
	SlsProject string `pulumi:"slsProject"`
	// The status of the resource. Valid values: `Enabled`, `Disable`.
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a GatewayLogging resource.
type GatewayLoggingArgs struct {
	// The ID of the Gateway.
	GatewayId pulumi.StringInput
	// The name of the Log Store.
	SlsLogstore pulumi.StringInput
	// The name of the Project.
	SlsProject pulumi.StringInput
	// The status of the resource. Valid values: `Enabled`, `Disable`.
	Status pulumi.StringPtrInput
}

func (GatewayLoggingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayLoggingArgs)(nil)).Elem()
}

type GatewayLoggingInput interface {
	pulumi.Input

	ToGatewayLoggingOutput() GatewayLoggingOutput
	ToGatewayLoggingOutputWithContext(ctx context.Context) GatewayLoggingOutput
}

func (*GatewayLogging) ElementType() reflect.Type {
	return reflect.TypeOf((*GatewayLogging)(nil))
}

func (i *GatewayLogging) ToGatewayLoggingOutput() GatewayLoggingOutput {
	return i.ToGatewayLoggingOutputWithContext(context.Background())
}

func (i *GatewayLogging) ToGatewayLoggingOutputWithContext(ctx context.Context) GatewayLoggingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayLoggingOutput)
}

func (i *GatewayLogging) ToGatewayLoggingPtrOutput() GatewayLoggingPtrOutput {
	return i.ToGatewayLoggingPtrOutputWithContext(context.Background())
}

func (i *GatewayLogging) ToGatewayLoggingPtrOutputWithContext(ctx context.Context) GatewayLoggingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayLoggingPtrOutput)
}

type GatewayLoggingPtrInput interface {
	pulumi.Input

	ToGatewayLoggingPtrOutput() GatewayLoggingPtrOutput
	ToGatewayLoggingPtrOutputWithContext(ctx context.Context) GatewayLoggingPtrOutput
}

type gatewayLoggingPtrType GatewayLoggingArgs

func (*gatewayLoggingPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayLogging)(nil))
}

func (i *gatewayLoggingPtrType) ToGatewayLoggingPtrOutput() GatewayLoggingPtrOutput {
	return i.ToGatewayLoggingPtrOutputWithContext(context.Background())
}

func (i *gatewayLoggingPtrType) ToGatewayLoggingPtrOutputWithContext(ctx context.Context) GatewayLoggingPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayLoggingPtrOutput)
}

// GatewayLoggingArrayInput is an input type that accepts GatewayLoggingArray and GatewayLoggingArrayOutput values.
// You can construct a concrete instance of `GatewayLoggingArrayInput` via:
//
//          GatewayLoggingArray{ GatewayLoggingArgs{...} }
type GatewayLoggingArrayInput interface {
	pulumi.Input

	ToGatewayLoggingArrayOutput() GatewayLoggingArrayOutput
	ToGatewayLoggingArrayOutputWithContext(context.Context) GatewayLoggingArrayOutput
}

type GatewayLoggingArray []GatewayLoggingInput

func (GatewayLoggingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayLogging)(nil)).Elem()
}

func (i GatewayLoggingArray) ToGatewayLoggingArrayOutput() GatewayLoggingArrayOutput {
	return i.ToGatewayLoggingArrayOutputWithContext(context.Background())
}

func (i GatewayLoggingArray) ToGatewayLoggingArrayOutputWithContext(ctx context.Context) GatewayLoggingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayLoggingArrayOutput)
}

// GatewayLoggingMapInput is an input type that accepts GatewayLoggingMap and GatewayLoggingMapOutput values.
// You can construct a concrete instance of `GatewayLoggingMapInput` via:
//
//          GatewayLoggingMap{ "key": GatewayLoggingArgs{...} }
type GatewayLoggingMapInput interface {
	pulumi.Input

	ToGatewayLoggingMapOutput() GatewayLoggingMapOutput
	ToGatewayLoggingMapOutputWithContext(context.Context) GatewayLoggingMapOutput
}

type GatewayLoggingMap map[string]GatewayLoggingInput

func (GatewayLoggingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayLogging)(nil)).Elem()
}

func (i GatewayLoggingMap) ToGatewayLoggingMapOutput() GatewayLoggingMapOutput {
	return i.ToGatewayLoggingMapOutputWithContext(context.Background())
}

func (i GatewayLoggingMap) ToGatewayLoggingMapOutputWithContext(ctx context.Context) GatewayLoggingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayLoggingMapOutput)
}

type GatewayLoggingOutput struct{ *pulumi.OutputState }

func (GatewayLoggingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GatewayLogging)(nil))
}

func (o GatewayLoggingOutput) ToGatewayLoggingOutput() GatewayLoggingOutput {
	return o
}

func (o GatewayLoggingOutput) ToGatewayLoggingOutputWithContext(ctx context.Context) GatewayLoggingOutput {
	return o
}

func (o GatewayLoggingOutput) ToGatewayLoggingPtrOutput() GatewayLoggingPtrOutput {
	return o.ToGatewayLoggingPtrOutputWithContext(context.Background())
}

func (o GatewayLoggingOutput) ToGatewayLoggingPtrOutputWithContext(ctx context.Context) GatewayLoggingPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v GatewayLogging) *GatewayLogging {
		return &v
	}).(GatewayLoggingPtrOutput)
}

type GatewayLoggingPtrOutput struct{ *pulumi.OutputState }

func (GatewayLoggingPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayLogging)(nil))
}

func (o GatewayLoggingPtrOutput) ToGatewayLoggingPtrOutput() GatewayLoggingPtrOutput {
	return o
}

func (o GatewayLoggingPtrOutput) ToGatewayLoggingPtrOutputWithContext(ctx context.Context) GatewayLoggingPtrOutput {
	return o
}

func (o GatewayLoggingPtrOutput) Elem() GatewayLoggingOutput {
	return o.ApplyT(func(v *GatewayLogging) GatewayLogging {
		if v != nil {
			return *v
		}
		var ret GatewayLogging
		return ret
	}).(GatewayLoggingOutput)
}

type GatewayLoggingArrayOutput struct{ *pulumi.OutputState }

func (GatewayLoggingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GatewayLogging)(nil))
}

func (o GatewayLoggingArrayOutput) ToGatewayLoggingArrayOutput() GatewayLoggingArrayOutput {
	return o
}

func (o GatewayLoggingArrayOutput) ToGatewayLoggingArrayOutputWithContext(ctx context.Context) GatewayLoggingArrayOutput {
	return o
}

func (o GatewayLoggingArrayOutput) Index(i pulumi.IntInput) GatewayLoggingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GatewayLogging {
		return vs[0].([]GatewayLogging)[vs[1].(int)]
	}).(GatewayLoggingOutput)
}

type GatewayLoggingMapOutput struct{ *pulumi.OutputState }

func (GatewayLoggingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]GatewayLogging)(nil))
}

func (o GatewayLoggingMapOutput) ToGatewayLoggingMapOutput() GatewayLoggingMapOutput {
	return o
}

func (o GatewayLoggingMapOutput) ToGatewayLoggingMapOutputWithContext(ctx context.Context) GatewayLoggingMapOutput {
	return o
}

func (o GatewayLoggingMapOutput) MapIndex(k pulumi.StringInput) GatewayLoggingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) GatewayLogging {
		return vs[0].(map[string]GatewayLogging)[vs[1].(string)]
	}).(GatewayLoggingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayLoggingInput)(nil)).Elem(), &GatewayLogging{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayLoggingPtrInput)(nil)).Elem(), &GatewayLogging{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayLoggingArrayInput)(nil)).Elem(), GatewayLoggingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayLoggingMapInput)(nil)).Elem(), GatewayLoggingMap{})
	pulumi.RegisterOutputType(GatewayLoggingOutput{})
	pulumi.RegisterOutputType(GatewayLoggingPtrOutput{})
	pulumi.RegisterOutputType(GatewayLoggingArrayOutput{})
	pulumi.RegisterOutputType(GatewayLoggingMapOutput{})
}
