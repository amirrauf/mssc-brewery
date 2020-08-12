package guru.springframework.msscbrewery.web.model;

import java.util.UUID;
import java.time.OffsetDateTime;
import javax.validation.constraints.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	@Null
	private UUID id;
	
	@NotBlank
	private String beerName;
	
	@NotBlank
	private String beerStyle;
	
	@Positive
	private Long upc;
	
    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;
	
}
