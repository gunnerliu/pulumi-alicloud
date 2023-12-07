// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Global Accelerator (GA) Endpoint Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.113.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ga"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			region := "cn-hangzhou"
//			if param := cfg.Get("region"); param != "" {
//				region = param
//			}
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultAccelerators, err := ga.GetAccelerators(ctx, &ga.GetAcceleratorsArgs{
//				Status: pulumi.StringRef("active"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultBandwidthPackage, err := ga.NewBandwidthPackage(ctx, "defaultBandwidthPackage", &ga.BandwidthPackageArgs{
//				Bandwidth:            pulumi.Int(100),
//				Type:                 pulumi.String("Basic"),
//				BandwidthType:        pulumi.String("Basic"),
//				PaymentType:          pulumi.String("PayAsYouGo"),
//				BillingType:          pulumi.String("PayBy95"),
//				Ratio:                pulumi.Int(30),
//				BandwidthPackageName: pulumi.String(name),
//				AutoPay:              pulumi.Bool(true),
//				AutoUseCoupon:        pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			defaultBandwidthPackageAttachment, err := ga.NewBandwidthPackageAttachment(ctx, "defaultBandwidthPackageAttachment", &ga.BandwidthPackageAttachmentArgs{
//				AcceleratorId:      *pulumi.String(defaultAccelerators.Ids[0]),
//				BandwidthPackageId: defaultBandwidthPackage.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultListener, err := ga.NewListener(ctx, "defaultListener", &ga.ListenerArgs{
//				AcceleratorId:  defaultBandwidthPackageAttachment.AcceleratorId,
//				ClientAffinity: pulumi.String("SOURCE_IP"),
//				Protocol:       pulumi.String("UDP"),
//				PortRanges: ga.ListenerPortRangeArray{
//					&ga.ListenerPortRangeArgs{
//						FromPort: pulumi.Int(60),
//						ToPort:   pulumi.Int(70),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultEipAddress, err := ecs.NewEipAddress(ctx, "defaultEipAddress", &ecs.EipAddressArgs{
//				Bandwidth:          pulumi.String("10"),
//				InternetChargeType: pulumi.String("PayByBandwidth"),
//				AddressName:        pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultEndpointGroup, err := ga.NewEndpointGroup(ctx, "defaultEndpointGroup", &ga.EndpointGroupArgs{
//				AcceleratorId:              defaultListener.AcceleratorId,
//				ListenerId:                 defaultListener.ID(),
//				Description:                pulumi.String(name),
//				ThresholdCount:             pulumi.Int(4),
//				TrafficPercentage:          pulumi.Int(20),
//				EndpointGroupRegion:        pulumi.String("cn-hangzhou"),
//				HealthCheckIntervalSeconds: pulumi.Int(3),
//				HealthCheckPath:            pulumi.String("/healthcheck"),
//				HealthCheckPort:            pulumi.Int(9999),
//				HealthCheckProtocol:        pulumi.String("http"),
//				PortOverrides: &ga.EndpointGroupPortOverridesArgs{
//					EndpointPort: pulumi.Int(10),
//					ListenerPort: pulumi.Int(60),
//				},
//				EndpointConfigurations: ga.EndpointGroupEndpointConfigurationArray{
//					&ga.EndpointGroupEndpointConfigurationArgs{
//						Endpoint: defaultEipAddress.IpAddress,
//						Type:     pulumi.String("PublicIp"),
//						Weight:   pulumi.Int(20),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultEndpointGroups := ga.GetEndpointGroupsOutput(ctx, ga.GetEndpointGroupsOutputArgs{
//				AcceleratorId: defaultEndpointGroup.AcceleratorId,
//				Ids: pulumi.StringArray{
//					defaultEndpointGroup.ID(),
//				},
//			}, nil)
//			ctx.Export("firstGaEndpointGroupId", defaultEndpointGroups.ApplyT(func(defaultEndpointGroups ga.GetEndpointGroupsResult) (*string, error) {
//				return &defaultEndpointGroups.Groups[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetEndpointGroups(ctx *pulumi.Context, args *GetEndpointGroupsArgs, opts ...pulumi.InvokeOption) (*GetEndpointGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEndpointGroupsResult
	err := ctx.Invoke("alicloud:ga/getEndpointGroups:getEndpointGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEndpointGroups.
type GetEndpointGroupsArgs struct {
	// The ID of the Global Accelerator instance to which the endpoint group will be added.
	AcceleratorId string `pulumi:"acceleratorId"`
	// The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
	EndpointGroupType *string `pulumi:"endpointGroupType"`
	// A list of Endpoint Group IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the listener that is associated with the endpoint group.
	ListenerId *string `pulumi:"listenerId"`
	// A regex string to filter results by Endpoint Group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getEndpointGroups.
type GetEndpointGroupsResult struct {
	AcceleratorId     string  `pulumi:"acceleratorId"`
	EndpointGroupType *string `pulumi:"endpointGroupType"`
	// A list of Ga Endpoint Groups. Each element contains the following attributes:
	Groups []GetEndpointGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// The ID of the listener that is associated with the endpoint group.
	ListenerId *string `pulumi:"listenerId"`
	NameRegex  *string `pulumi:"nameRegex"`
	// A list of Endpoint Group names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the endpoint group.
	Status *string `pulumi:"status"`
}

func GetEndpointGroupsOutput(ctx *pulumi.Context, args GetEndpointGroupsOutputArgs, opts ...pulumi.InvokeOption) GetEndpointGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEndpointGroupsResult, error) {
			args := v.(GetEndpointGroupsArgs)
			r, err := GetEndpointGroups(ctx, &args, opts...)
			var s GetEndpointGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEndpointGroupsResultOutput)
}

// A collection of arguments for invoking getEndpointGroups.
type GetEndpointGroupsOutputArgs struct {
	// The ID of the Global Accelerator instance to which the endpoint group will be added.
	AcceleratorId pulumi.StringInput `pulumi:"acceleratorId"`
	// The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
	EndpointGroupType pulumi.StringPtrInput `pulumi:"endpointGroupType"`
	// A list of Endpoint Group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the listener that is associated with the endpoint group.
	ListenerId pulumi.StringPtrInput `pulumi:"listenerId"`
	// A regex string to filter results by Endpoint Group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetEndpointGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndpointGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getEndpointGroups.
type GetEndpointGroupsResultOutput struct{ *pulumi.OutputState }

func (GetEndpointGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndpointGroupsResult)(nil)).Elem()
}

func (o GetEndpointGroupsResultOutput) ToGetEndpointGroupsResultOutput() GetEndpointGroupsResultOutput {
	return o
}

func (o GetEndpointGroupsResultOutput) ToGetEndpointGroupsResultOutputWithContext(ctx context.Context) GetEndpointGroupsResultOutput {
	return o
}

func (o GetEndpointGroupsResultOutput) AcceleratorId() pulumi.StringOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) string { return v.AcceleratorId }).(pulumi.StringOutput)
}

func (o GetEndpointGroupsResultOutput) EndpointGroupType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) *string { return v.EndpointGroupType }).(pulumi.StringPtrOutput)
}

// A list of Ga Endpoint Groups. Each element contains the following attributes:
func (o GetEndpointGroupsResultOutput) Groups() GetEndpointGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) []GetEndpointGroupsGroup { return v.Groups }).(GetEndpointGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEndpointGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEndpointGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// The ID of the listener that is associated with the endpoint group.
func (o GetEndpointGroupsResultOutput) ListenerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) *string { return v.ListenerId }).(pulumi.StringPtrOutput)
}

func (o GetEndpointGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Endpoint Group names.
func (o GetEndpointGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetEndpointGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the endpoint group.
func (o GetEndpointGroupsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointGroupsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEndpointGroupsResultOutput{})
}
