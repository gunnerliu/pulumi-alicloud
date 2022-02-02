// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Snat Entries owned by an Alibaba Cloud account.
//
// > **NOTE:** Available in 1.37.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "snat-entry-example-name"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		opt0 := "VSwitch"
// 		_default, err := alicloud.GetZones(ctx, &GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		fooNetwork, err := vpc.NewNetwork(ctx, "fooNetwork", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		fooSwitch, err := vpc.NewSwitch(ctx, "fooSwitch", &vpc.SwitchArgs{
// 			VpcId:            fooNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/21"),
// 			AvailabilityZone: pulumi.String(_default.Zones[0].Id),
// 			VswitchName:      pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		fooNatGateway, err := vpc.NewNatGateway(ctx, "fooNatGateway", &vpc.NatGatewayArgs{
// 			VpcId:         fooNetwork.ID(),
// 			Specification: pulumi.String("Small"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		fooEipAddress, err := ecs.NewEipAddress(ctx, "fooEipAddress", &ecs.EipAddressArgs{
// 			AddressName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ecs.NewEipAssociation(ctx, "fooEipAssociation", &ecs.EipAssociationArgs{
// 			AllocationId: fooEipAddress.ID(),
// 			InstanceId:   fooNatGateway.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		fooSnatEntry, err := vpc.NewSnatEntry(ctx, "fooSnatEntry", &vpc.SnatEntryArgs{
// 			SnatTableId:     fooNatGateway.SnatTableIds,
// 			SourceVswitchId: fooSwitch.ID(),
// 			SnatIp:          fooEipAddress.IpAddress,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_ = vpc.GetSnatEntriesOutput(ctx, vpc.GetSnatEntriesOutputArgs{
// 			SnatTableId: fooSnatEntry.SnatTableId,
// 		}, nil)
// 		return nil
// 	})
// }
// ```
func GetSnatEntries(ctx *pulumi.Context, args *GetSnatEntriesArgs, opts ...pulumi.InvokeOption) (*GetSnatEntriesResult, error) {
	var rv GetSnatEntriesResult
	err := ctx.Invoke("alicloud:vpc/getSnatEntries:getSnatEntries", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnatEntries.
type GetSnatEntriesArgs struct {
	// A list of Snat Entries IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the resource name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The name of snat entry.
	SnatEntryName *string `pulumi:"snatEntryName"`
	// The public IP of the Snat Entry.
	SnatIp *string `pulumi:"snatIp"`
	// The ID of the Snat table.
	SnatTableId string `pulumi:"snatTableId"`
	// The source CIDR block of the Snat Entry.
	SourceCidr *string `pulumi:"sourceCidr"`
	// The source vswitch ID.
	SourceVswitchId *string `pulumi:"sourceVswitchId"`
	// The status of the Snat Entry. Valid values: `Available`, `Deleting` and `Pending`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getSnatEntries.
type GetSnatEntriesResult struct {
	// A list of Snat Entries. Each element contains the following attributes:
	Entries []GetSnatEntriesEntry `pulumi:"entries"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Optional) A list of Snat Entries IDs.
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The name of snat entry.
	SnatEntryName *string `pulumi:"snatEntryName"`
	// The public IP of the Snat Entry.
	SnatIp      *string `pulumi:"snatIp"`
	SnatTableId string  `pulumi:"snatTableId"`
	// The source CIDR block of the Snat Entry.
	SourceCidr *string `pulumi:"sourceCidr"`
	// The source vswitch ID.
	SourceVswitchId *string `pulumi:"sourceVswitchId"`
	// The status of the Snat Entry.
	Status *string `pulumi:"status"`
}

func GetSnatEntriesOutput(ctx *pulumi.Context, args GetSnatEntriesOutputArgs, opts ...pulumi.InvokeOption) GetSnatEntriesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSnatEntriesResult, error) {
			args := v.(GetSnatEntriesArgs)
			r, err := GetSnatEntries(ctx, &args, opts...)
			return *r, err
		}).(GetSnatEntriesResultOutput)
}

// A collection of arguments for invoking getSnatEntries.
type GetSnatEntriesOutputArgs struct {
	// A list of Snat Entries IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by the resource name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The name of snat entry.
	SnatEntryName pulumi.StringPtrInput `pulumi:"snatEntryName"`
	// The public IP of the Snat Entry.
	SnatIp pulumi.StringPtrInput `pulumi:"snatIp"`
	// The ID of the Snat table.
	SnatTableId pulumi.StringInput `pulumi:"snatTableId"`
	// The source CIDR block of the Snat Entry.
	SourceCidr pulumi.StringPtrInput `pulumi:"sourceCidr"`
	// The source vswitch ID.
	SourceVswitchId pulumi.StringPtrInput `pulumi:"sourceVswitchId"`
	// The status of the Snat Entry. Valid values: `Available`, `Deleting` and `Pending`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetSnatEntriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnatEntriesArgs)(nil)).Elem()
}

// A collection of values returned by getSnatEntries.
type GetSnatEntriesResultOutput struct{ *pulumi.OutputState }

func (GetSnatEntriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnatEntriesResult)(nil)).Elem()
}

func (o GetSnatEntriesResultOutput) ToGetSnatEntriesResultOutput() GetSnatEntriesResultOutput {
	return o
}

func (o GetSnatEntriesResultOutput) ToGetSnatEntriesResultOutputWithContext(ctx context.Context) GetSnatEntriesResultOutput {
	return o
}

// A list of Snat Entries. Each element contains the following attributes:
func (o GetSnatEntriesResultOutput) Entries() GetSnatEntriesEntryArrayOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) []GetSnatEntriesEntry { return v.Entries }).(GetSnatEntriesEntryArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSnatEntriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Optional) A list of Snat Entries IDs.
func (o GetSnatEntriesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSnatEntriesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetSnatEntriesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSnatEntriesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The name of snat entry.
func (o GetSnatEntriesResultOutput) SnatEntryName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) *string { return v.SnatEntryName }).(pulumi.StringPtrOutput)
}

// The public IP of the Snat Entry.
func (o GetSnatEntriesResultOutput) SnatIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) *string { return v.SnatIp }).(pulumi.StringPtrOutput)
}

func (o GetSnatEntriesResultOutput) SnatTableId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) string { return v.SnatTableId }).(pulumi.StringOutput)
}

// The source CIDR block of the Snat Entry.
func (o GetSnatEntriesResultOutput) SourceCidr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) *string { return v.SourceCidr }).(pulumi.StringPtrOutput)
}

// The source vswitch ID.
func (o GetSnatEntriesResultOutput) SourceVswitchId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) *string { return v.SourceVswitchId }).(pulumi.StringPtrOutput)
}

// The status of the Snat Entry.
func (o GetSnatEntriesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnatEntriesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSnatEntriesResultOutput{})
}
